## Encontrar a letra mais usada da palavra

Existem alguns pontos sobre esse código, o primeiro deles é que você só consegue executar ele com o graalvm 21 ou desatualizar a versão do pom para 17 e usar graalvm 17 como desejar, porem o objeto `Pair` que utilizei existe somente nesse jdk

O algorítimo utiliza somente 1 for, como proposto no video do **Lucas Montano** do canal **Lucas Montano**: https://www.youtube.com/watch?v=stV8vOrUGBg

Note que, o nome do método é `letraComMaiorOcorrencia`, porem não é bem a letra mais utilizada, mais sim o carácter mais utilizado, o algorítimo também diferencia letra maiúscula de minuscula. Esses foram problemas que notei só não quis arrumar