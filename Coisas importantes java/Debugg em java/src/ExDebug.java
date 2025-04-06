public class ExDebug {
    // Programa sempre inicia e finaliza no método main
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main");
        // Chamando o método
        a();
        System.out.println("Finalizou do programa no método main");
    }

    static void a() {
        System.out.println("Entrou no método a.System.err.println");
        // Chamando o método
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() { 
        System.out.println("Entrou no método b.");
        for(int i = 0; i <=4; i++) System.out.println(i);
        // Chamando o método
        c();
        System.out.println("Finalizou o método b.");
    }
    // Quando finalizar esse metodo, os outros metodos acima serão finalizado também
    static void c() { 
        System.out.println("Entrou no método c.");
        // Mostra como a pilha de codigo funciona na ordem de baixo pra cima 
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
