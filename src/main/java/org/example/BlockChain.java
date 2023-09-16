package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlockChain {

    List<Block> blockchain;

    public BlockChain() {
        this.blockchain = new ArrayList<>();
        Block genesisBlock = new Block(
                "Genesis block",
                null,
                new Date().getTime());
        this.blockchain.add(genesisBlock);
    }

    public int size(){
        return blockchain.size();
    }

    public Block get(int index){
        return blockchain.get(index);
    }

    public void add(Block b){
        blockchain.add(b);
    }
}
