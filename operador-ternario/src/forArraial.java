public class forArraial {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas","Thiago", "Gabriel"};
        
        // for (int x = 0; x <= alunos.length; x++){
        //     System.out.println("O aluno atual é o "+ alunos[x]);
        // }
        for (String aluno : alunos){
            System.out.println("O aluno atual é: "+aluno);
        }
    }
}
