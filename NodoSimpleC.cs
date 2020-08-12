using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace NodoSimpleC {

    class ListaOrdenada {

        class Nodo {

            public int val1;

            public Nodo nodo1;

        }

        private Nodo raiz;

        public ListaOrdenada() {
            raiz = null;
        }

        void agg(int m) {

            Nodo nuevo = new Nodo();
            nuevo.val1 = m;

            if (raiz == null) {

                raiz = nuevo;

            } else {

                if (m < raiz.val1) {

                    nuevo.nodo1 = raiz;
                    raiz = nuevo;

                } else {

                    Nodo dat1 = raiz;
                    Nodo atras = raiz;

                    while (m >= dat1.val1 && dat1.nodo1 != null) {

                        atras = dat1;
                        dat1 = dat1.nodo1;

                    }

                    if (m >= dat1.val1) {

                        dat1.nodo1 = nuevo;

                    } else {

                        nuevo.nodo1 = dat1;
                        atras.nodo1 = nuevo;

                    }
                }
            }
        }
        

        public void Imprimir() {

            Nodo dat1 = raiz;

            Console.WriteLine("------------------------------------");

            Console.WriteLine("Elementos de la pila: ");


            while (dat1 != null) {

                Console.Write (dat1.val1 + " ");
                dat1 = dat1.nodo1;

            }

            Console.WriteLine();
            
            Console.WriteLine("------------------------------------");

        }

        static void Main(string[] args) {

            ListaOrdenada ejemplo = new ListaOrdenada();

            ejemplo.agg(1);
            ejemplo.agg(2);
            ejemplo.agg(3);
            ejemplo.agg(4);

            ejemplo.Imprimir();
            
        }
    }
}