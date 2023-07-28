package coba;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    ArrayList<Node> listNode = new ArrayList<>();
    ArrayList<Node> urutanBFS = new ArrayList<>();

    public void insert(Node node){
        listNode.add(node);
    }

    public void bfs(int[][] adjMatriks, Node root){
        Queue<Node> queueNode = new LinkedList<>();
        queueNode.add(root);

        while (!queueNode.isEmpty()){
            Node node = queueNode.remove();

            if (!node.getKunjungi()){
                urutanBFS.add(node);
                node.setKunjungi(true);
            }

            ArrayList<Node> listTetangga = getTetangga(adjMatriks, node);

            for (Node tetangga : listTetangga) {
                if (!tetangga.getKunjungi()) {
                    queueNode.add(tetangga);
                }
            }
        }
    }

    public ArrayList<Node> getTetangga(int[][] adjMatriks, Node node){
        int index = -1;
        ArrayList<Node> listTetangga = new ArrayList<>();

        for (int i = 0; i < listNode.size(); i++){
            if (listNode.get(i).getNode() == node.getNode()){
                index = i;
                break;
            }
        }

        if (index != -1){
            for (int i = 0; i < adjMatriks[index].length; i++){
                if (adjMatriks[index][i] == 1){
                    listTetangga.add(listNode.get(i));
                }
            }
        }

        return listTetangga;
    }

    public void tampilBFS () {
        for (Node node : urutanBFS) {
            System.out.print(node.getNode() + " ");
        }
    }

}
