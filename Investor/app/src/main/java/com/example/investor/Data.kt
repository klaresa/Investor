package com.example.investor

val data = listOf(
    Pair("Por quanto tempo vc pretende deixar seu dinheiro investido?",
        listOf(
            Pair("Menos de 6 meses ", 0),
            Pair("Entre 6 meses e 1 ano", 2),
            Pair("Entre 1 ano e 3 anos", 3),
            Pair("Acima de 3 anos", 4)
        )
    ),
    Pair("Qual o objetivo desse investimento? ",
        listOf(
            Pair("Preservação do capital para não perder valor ao longo do tempo assumindo baixos riscos de perdas", 0),
            Pair("Aumento gradual do capital ao longo do tempo, assumindo riscos moderados", 2),
            Pair("Aumento do capital acima da taxa de retorno média do mercado, mesmo que isso implique assumir riscos de perdas elevadas", 4),
            Pair("Obter no curto prazo retornos elevados e significativamente acima da taxa de retorno média do mercado, assumindo riscos elevados", 5)
        )
    ),
    Pair("Qual das alternativas melhor classifica sua formação e experiência com o mercado financeiro?",
        listOf(
            Pair("Não possuo formação acadêmica ou conhecimento do mercado financeiro", 0),
            Pair("Possuo formação acadêmica na área financeira, mas não tenho experiência", 1),
            Pair("Possuo formação acadêmica em outra área, mas possuo conhecimento do mercado financeiro", 2),
            Pair("Possuo formação acadêmica na área financeira ou pleno conhecimento do mercado financeiro", 4)
        )
    ),
    Pair("Considerando seus rendimentos regulares, qual a porcentagem você pretende reservar para aplicações financeiras?",
        listOf(
            Pair("No maximo 25%", 0),
            Pair("Entre 25% e 50%", 2),
            Pair("Acima de 50%", 4)
        )
    ),
    Pair("Caso as suas aplicações sofressem uma queda superior a 30%, o que você faria?",
        listOf(
            Pair("Resgataria toda a aplicação e aplicaria na poupança", 0),
            Pair("Manteria aplicação aguardando uma melhora do mercado", 2),
            Pair("Aumentaria a aplicação para aproveitar as oportunidades do mercado", 4)
        )
    ),
    Pair("Como está distribuído o seu patrimônio?",
        listOf(
            Pair("Meu patrimônio não está aplicado ou está todo aplicado em renda fixa e/ou imóveis ", 0),
            Pair("Menos de 25% em renda variável e o restante em renda fixa e/ou imóveis", 2),
            Pair("Entre 25,01 e 50% aplicado em renda variável e o restante em renda fixa e/ou imóveis", 3),
            Pair("Acima de 50% em renda variável", 4)
        )
    ),
    Pair("Em relação as aplicações e rendimentos, em qual dessas situações você se enquadra?",
        listOf(
            Pair("Conto com o rendimento dessas aplicações para complementar minha renda mensal ", 0),
            Pair("Eventualmente posso resgatar parte das aplicações para fazer frente aos meus gastos. Contudo, não tenho intenção de resgatar no curto prazo e pretendo fazer aplicações regulares", 2),
            Pair("Não tenho intenção de resgatar no curto prazo e ainda pretendo fazer aplicações regulares", 3),
            Pair("Não tenho intenção de resgatar no curto prazo, mas não pretendo realizar novas aplicações", 4)
        )
    ),
    Pair("Qual sua faixa de renda mensal média?",
        listOf(
            Pair("Até R$ 1.000", 0),
            Pair("De R$ 1.001 até R$ 5.000", 2),
            Pair("De R$ 5.001 até R$ 10.000 ", 3),
            Pair("Acima de R$ 10.000", 4)
        )
    ),
    Pair("Qual o valor aproximado do seu patrimônio?",
        listOf(
            Pair("Até R$ 10.000 ", 0),
            Pair("De R$ 10.001 até R$ 100.000 ", 2),
            Pair("De R$ 500.000 até R$ 1.000.000 ", 3),
            Pair("Acima de R$ 1.000.001 ", 4)
        )
    )

)