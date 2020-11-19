Robo 3 - Desafio

A startup em que você faz estágio está com um grande desafio na área de robótica. O seu chefe lhe havia solicitado que modelasse um simulador em Java que demostrasse as funcionalidades do robô de transporte. Você e sua equipe se reuniram e juntos decidiram chamar o robô a ser projetado de Robô Autônomo Transporte de Mercadoria (R-ATM). 

Os projetistas do robô especificaram, por enquanto, que o R-ATM será do tipo esteira e possuirá braços robóticos para captura das caixas. O robô terá um peso de aproximadamente 70 kg, e sua velocidade de deslocamento máxima atingirá por volta de 5 m/s. Não se sabe ainda qual será a capacidade de carga máxima do robô, mas os especialistas acreditam que ela girará em torno de 20 kg. Essa e outras especificações serão mais bem ajustadas ao longo do desenvolvimento do projeto. 

Foi especificado que o robô vai operar em uma sala plana de formato, a princípio, retangular. O robô saberá, mediante tecnologia de rádio, a própria localização em tempo real. Dessa forma, o robô terá uma localização descrita em coordenadas x, y. Com base nessas especificações iniciais, o seu chefe pede que você inicie a modelagem da classe robô enquanto os engenheiros projetam o hardware dele.

Para resolver a questão da proposta, você percebe que precisa iniciar a modelagem da classe robô e precisa criá-la com os seguintes atributos: 

nome
peso 
velocidadeMax
pesoCargaMax
tipoTracao
posicaoX
posicaoY 
Como o seu robô pode deslocar-se pelo ambiente, você também decide criar um método para mover o robô para uma dada posição x e y. Você decide também criar um método para imprimir o status do robô. Esse método de impressão de status auxilia a verificar o estado da classe robô e prevenir erros. 
Não foram especificadas, ainda, nas reuniões com a equipe as dimensões da sala em que o robô se encontra. Você então assume que é uma sala quadrada bem grande de dimensões de 100 metros por 100 metros. A fim de simplificar as coisas, você decide colocar o robô no centro da sala, ou seja, na posição (50, 50). O Código 1.4 a seguir mostra como é uma possível codificação da situação-problema aqui apresentada.