package com.refinedmods.refinedpipes.network.graph;

import com.refinedmods.refinedpipes.network.Network;
import com.refinedmods.refinedpipes.network.pipe.Destination;
import com.refinedmods.refinedpipes.network.pipe.DestinationType;
import com.refinedmods.refinedpipes.network.pipe.Pipe;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import java.util.*;

public class NetworkGraph {
    private final Network network;

    private Set<Pipe> pipes = new HashSet<>();
    private final Map<BlockPos, Pipe> pipesByPos = new HashMap<>();
    private Map<DestinationType, List<Destination>> destinations = new HashMap<>();

    public NetworkGraph(Network network) {
        this.network = network;
    }

    public NetworkGraphScannerResult scan(Level originLevel, BlockPos originPos) {
        NetworkGraphScanner scanner = new NetworkGraphScanner(pipes, network.getType());

        NetworkGraphScannerResult result = scanner.scanAt(originLevel, originPos);

        this.pipes = result.getFoundPipes();
        pipesByPos.clear();
        this.pipes.forEach(pipe -> pipesByPos.put(pipe.getPos(), pipe));

        result.getNewPipes().forEach(p -> p.joinNetwork(network));
        result.getRemovedPipes().forEach(Pipe::leaveNetwork);

        destinations.clear();

        for (Destination destination : result.getDestinations()) {
            destinations.computeIfAbsent(destination.getType(), type -> new ArrayList<>()).add(destination);
        }

        return result;
    }

    public Set<Pipe> getPipes() {
        return pipes;
    }

    public Pipe getPipe(BlockPos pos) {
        return pipesByPos.get(pos);
    }

    public List<Destination> getDestinations(DestinationType type) {
        return destinations.getOrDefault(type, Collections.emptyList());
    }
}
