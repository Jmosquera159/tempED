public class NodoSimpleJ {
     
        class Nodo {
            int val;
            Nodo siguienteNodo;
        }
     
        private Nodo raiz;
        
        public NodoSimpleJ () {
            raiz=null;
        }
        
        public void agregar(int m) {
         Nodo nodo1;
         nodo1 = new Nodo();
         nodo1.val = m;
            if (raiz==null)
            {
                nodo1.siguienteNodo = null;
                raiz = nodo1;
            }
            else
            {
                nodo1.siguienteNodo = raiz;
                raiz = nodo1;
            }
        }
        
        public int obtener ()
        {
            if (raiz!=null)
            {
                int informacion = raiz.val;
                raiz = raiz.siguienteNodo;
                return informacion;
            }
            else
            {
                return Integer.MAX_VALUE;
            }
        }
        
        public void imprimir() {

            Nodo dat1 = raiz;

            System.out.println("------------------------------------");

            System.out.println("Elementos de la pila: ");

            while (dat1 != null) {

                System.out.print(dat1.val + " ");

                dat1 = dat1.siguienteNodo;
            }

            System.out.println();
        }
        
        public static void main(String[] ar) {

            NodoSimpleJ ejemplo = new NodoSimpleJ();

            ejemplo.agregar(1);
            ejemplo.agregar(2);
            ejemplo.agregar(3);
            ejemplo.agregar(4);

            ejemplo.imprimir();

            System.out.println("------------------------------------");

            System.out.println("pila extraída: " + ejemplo.obtener());

            ejemplo.imprimir();  

            System.out.println("------------------------------------");

        }
}
