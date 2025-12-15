package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Tree {
    private int treeId;
    private String treeType;

    public Tree() { System.out.println("Tree constructor created"); }

    public int getTreeId() { return treeId; }
    public void setTreeId(int treeId) { this.treeId = treeId; }
    public String getTreeType() { return treeType; }
    public void setTreeType(String treeType) { this.treeType = treeType; }

    @Override
    public String toString() {
        return "Tree{" + "treeId=" + treeId + ", treeType='" + treeType + '\'' + '}';
    }
}
