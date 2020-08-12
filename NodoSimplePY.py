class NodoSimplePY:
    def __init__(self, dato1 = None, dato2 = None):

        self.dato1 = dato1
        self.dato2 = dato2

class lista: 

    def __init__(self):

        self.head = None
    
    def aggFrente(self, dato1):

        self.head = NodoSimplePY(dato1=dato1, dato2=self.head)  

    def listaVacia(self):

        return self.head == None

    def aggFinal(self, dato1):

        if not self.head:

            self.head = NodoSimplePY(dato1=dato1)

            return

        val1 = self.head

        while val1.dato2:

            val1 = val1.dato2

        val1.dato2 = NodoSimplePY(dato1=dato1)

    def borrar(self, dato3):

        val1 = self.head
        prev = None

        while val1 and val1.dato1 != dato3:

            prev = val1
            val1 = val1.dato2

        if prev is None:

            self.head = val1.dato2

        elif val1:

            prev.dato2 = val1.dato2
            val1.dato2 = None

    def ultimo(self):

        temp = self.head

        while(temp.dato2 is not None):

            temp = temp.dato2

        return temp.dato1

    def mostrarLista( self ):

        NodoSimplePY = self.head

        while NodoSimplePY != None:
            
            print(NodoSimplePY.dato1, end =" ")
            NodoSimplePY = NodoSimplePY.dato2

s = lista() 

s.aggFrente(1)
s.aggFinal(2)
s.aggFrente(3)
s.aggFinal(4) 

s.mostrarLista() 