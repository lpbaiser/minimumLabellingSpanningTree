package br.edu.utfpr.buildTree;

import br.edu.utfpr.buildTree.buscaProfundidade.BuscaProfundidade;
import br.edu.utfpr.buildTree.buscaProfundidade.Grafo;
import br.edu.utfpr.buildTree.buscaProfundidade.Vertice;
import br.edu.utfpr.buildTree.buscaProfundidade.VerticeBuscaProfundidade;
import java.util.List;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        FileReader fr = new FileReader();
//        fr.readFile("/home/leonardo/Dropbox/Grafos/ApsPAGRM/instances/group_1/HDGraph20_20.txt");
        List<GrafoMatriz> grafos = fr.readFile("/home/leonardo/Dropbox/Grafos/ApsPAGRM/instances/group_1/HDGraph20_20.txt");
        Grafo g = GrafoMatriz.grafoMatrixToGafo(grafos.get(0));
        VerticeBuscaProfundidade s = new VerticeBuscaProfundidade();
        s.setId("1");
        BuscaProfundidade bl = new BuscaProfundidade(g, s);
        bl.executar();
//        fr.readFile("/home/leonardo/Dropbox/Grafos/ApsPAGRM/instances/group_1/MDGraph50_50.txt");
//        fr.readFile("/home/leonardo/Dropbox/Grafos/ApsPAGRM/instances/group_2_with_n=500/MDGraph500_625.txt");
    }
    
}
