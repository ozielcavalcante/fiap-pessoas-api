# Sistema de Monitoramento de Energia - API de Pessoas

Funcionalidades:

* Recebe dados de pessoas relacionadas aos usuários cadastrados em nosso sistema 
(nome, data de nascimento, sexo e parentesco). Nome é obrigatório e 
data de nascimento, além de obrigatório, deve ser anterior a data atual. 
Sexo e parentesco são opcionais. Caso seja válido, retorna uma mensagem 
positiva, caso seja inválido, retorna uma lista com os campos inválidos 
e seus erros.

Exemplo de requisição válida:  
curl --location 'http://localhost:8080/pessoas' \  
--header 'Content-Type: application/json' \  
--data '{  
&emsp;&emsp;"nome": "Silva da Costa",  
&emsp;&emsp;"dataNascimento": "30/06/1994",  
&emsp;&emsp;"sexo": "sim",  
&emsp;&emsp;"parentesco": "filho"  
}'

Exemplo de requisição inválida:  
curl --location 'http://localhost:8080/pessoas' \  
--header 'Content-Type: application/json' \  
--data '{  
&emsp;&emsp;"dataNascimento": "30/06/2030",  
&emsp;&emsp;"parentesco": "filho"  
}'

Ferramentas utilizadas

* Spring Boot
* Bean Validation
