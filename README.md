# SOLID_ID
Sorveteria com Inversão de Dependência do padrão SOLID

# A inversão de dependência (ID) é um princípio fundamental para:

- Baixo acoplamento: as classes não dependem de implementações específicas, mas sim de interfaces e abstrações. Isso permite que diferentes implementações sejam usadas sem afetar o código principal.
- Alta coesão: as classes assumem responsabilidades mais bem definidas, tornando o código mais organizado e fácil de entender.
- Facilidade de teste: os testes podem ser facilmente isolados, pois as classes dependem de interfaces que podem ser mockadas ou substituídas por implementações de teste.
- Flexibilidade: o sistema é mais adaptável a novas necessidades e mudanças nos requisitos.

# No projeto de sorvete, a ID foi utilizada para:

- Criar interfaces e abstrações: Sabor e Tamanho foram definidas para abstrair as características de cada tipo de produto.
- Implementar a injeção de dependência: a Sorveteria recebe instâncias de classes de sabor e tamanho através de seus criadores, permitindo que ele trabalhe com diferentes implementações desses produtos.

# Benefícios da ID no projeto:

- Código mais flexível e adaptável: o sistema pode ser facilmente modificado para atender a novas necessidades sem afetar o código principal.
- Maior testabilidade: os testes podem ser isolados e realizados com mais facilidade.
- Menor acoplamento entre classes: as classes dependem de interfaces e abstrações, o que reduz o acoplamento entre elas e facilita a reutilização.
- Código mais robusto e menos propenso a erros: a ID ajuda a prevenir erros causados por dependências rígidas entre classes.

# Conclusão:

A inversão de dependência é um princípio crucial que contribui para um código mais flexível, testável, robusto e menos propenso a erros.
