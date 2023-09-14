/*
programa {
  funcao inicio() {
    real l1,ar
    
    escreva ("Digite o lado de seu quadrado: ")
    leia (l1)

    ar= l1*l1

    escreva ("Sua area é: "+ar)
  }
}
*/
/*
programa {
  funcao inicio() {
     real b,h,ar
    
    escreva ("Digite a altura: ")
    leia (h)

    escreva ("Digite a base: ")
    leia (b)

    ar= b*h

    escreva ("Sua area é: "+ar)
  }
}
*/
/*
programa {
  funcao inicio() {
     real b1,b2,bb,h,ar
  
    escreva ("Digite a primeira base: ")
    leia (b1)

    escreva ("Digite a segunda base: ")
    leia (b2)

    escreva ("Digite a altura: ")
    leia (h)

    bb= b1+b2
    ar= bb*h/2

    escreva ("Sua area é: "+ar)
  }
}
*/
/*
programa {
  funcao inicio() {
    real pi,r,ar
  
    escreva ("Digite o raio: ")
    leia (r)

    pi=3.14
    ar= pi*r*r

    escreva ("Sua area é: "+ar)
  }
}
*/
/*
programa {
  funcao inicio() {
    real b,h,ar
    
    escreva ("Digite a altura: ")
    leia (h)

    escreva ("Digite a base: ")
    leia (b)

    ar= b*h/2

    escreva ("Sua area é: "+ar)
  }
}
*/
/*
programa {
  funcao inicio() {
    real sal,por,por2,inss

    escreva ("Digite o salario: ")
    leia (sal)

    por= 14*sal
    por2= por/100
    inss= sal-por2

    escreva("Seu desconto do INSS é: " + inss)
  }
}
*/
/*
programa {
  funcao inicio() {
    real sal,por,por2,salf
escreva("Digite o salario: ")
leia(sal)

por=5.sal
por2= por/100
salf= sal + por2

escreva("Seu aumento com salario familia é: " +salf)
  }
}
*/
/*
programa {
  funcao inicio() {
    real p,h,h2,imc

    escreva ("Digite o peso: ")
    leia (p)

    escreva ("Digite a altura: ")
    leia (h)

    h2= h*h
    imc= p*h2
  
    escreva("Seu IMC é: " + imc)
  }
}
*/
/*
programa {
  funcao inicio() {
    real prod,imp,luc,luc1,luc2,res

    escreva ("Digite o preço bruto: ")
    leia (prod)

    escreva ("Digite o valor dos impostos: ")
    leia (imp)

    escreva ("Digite o valor da margem de lucro em %: ")
    leia (luc)

    luc1= luc*prod
    luc2= luc1/100
    res= prod+imp+luc2
  
    escreva("Valor total: " + res)
  }
}
*/
/*programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
  real a,b,b2,c,delt,bas1,bas2,raz
   escreva ("Digite o valor de A:")
   leia (a)

   escreva ("Digite o valor de B:")
   leia (b)

   escreva ("Digite o valor de C:")
   leia (c)

b2= b*b 
delt= b2-4*a*c 
raz= mat.raiz (delt,2)
bas1= -b + raz /2*a
bas2= -b - raz /2*a
escreva ("Sua raiz é: " + bas1 + " & " +bas2)
  }
}
*/
/*
programa {
  funcao inicio() {
    inteiro l,c , matz1 [3] [3] {{1,2,3},
                                 {4,5,6},
                                 {7,8,9}}

    inteiro matz2 [3] [3] {{10,11,12},
                           {13,14,15},
                           {16,17,18}}
    inteiro matz3 [3] [3]

   para (l=0; l<3; l++){
    para (c=0; c<3; c++){
     matz3[l][c] = matz1[l][c] + matz2 [l][c]
    }
   }

para(l=0; l<3; l++){
  para (c=0; c<3; c++){
escreva (matz3[l][c], "")
   }
escreva("\n")

  }
  }
}
*/
/*
programa {
  funcao inicio() {
    inteiro n1,n2,dif

    escreva("Digite um numero negativo: ")
    leia(n1)

    escreva("Digite outro numero negativo: ")
    leia(n2)
   dif= n1-n2

escreva("A diferença é: " +dif)

  }
}
*/
/*
programa {

  inclua biblioteca Matematica --> mat
  funcao inicio() {
    real n1,raz

   escreva ("Digite um valor:")
   leia (n1)

   raz= mat.raiz(n1,2)

escreva ("Sua raiz quadrada é: "+ raz)


  }
}
*/