package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class BlockChainTest {

    BlockChain blockChain = new BlockChain();
    int prefix = 4;
    String prefixString = new String(new char[prefix]).replace('\0', '0');

    @Test
    public void givenBlockchain_whenNewBlockAdded_thenSuccess() {
        Block newBlock = new Block(
                "The is a New Block.",
                blockChain.get(blockChain.size() - 1).getHash(),
                new Date().getTime());
        newBlock.mineBlock(prefix);
        Assertions.assertTrue(newBlock.getHash().substring(0, prefix).equals(prefixString));
        blockChain.add(newBlock);
        blockChain.get(0);
    }

}