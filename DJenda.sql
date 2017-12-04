create database djenda;
use djenda;


CREATE TABLE usuario (
 idUsuario INT NOT NULL AUTO_INCREMENT,
 emailUsuario VARCHAR(50) NOT NULL,
 nomeUsuario VARCHAR(50) NOT NULL,
 senhaUsuario VARCHAR(25) NOT NULL,
 dataNascimentoUsuario DATE NOT NULL,
 nickUsuario VARCHAR(50),
 fraseDicaUsuario VARCHAR(50),
 PRIMARY KEY (idUsuario,emailUsuario)
);



CREATE TABLE contato (
 idContato INT NOT NULL AUTO_INCREMENT,
 idUsuario INT NOT NULL,
 emailUsuario VARCHAR(50) NOT NULL,
 nomeContato VARCHAR(50) NOT NULL,
 tipoContato VARCHAR(50) ,
 ondeConheciContato VARCHAR(50),
 organizacaoContato VARCHAR(50),
 dataNascimentoContato DATE,
 emailContato VARCHAR(50) NOT NULL,
 telefoneContato VARCHAR(50) NOT NULL,
 PRIMARY KEY (idContato,idUsuario,emailUsuario),
 FOREIGN KEY (idUsuario,emailUsuario) REFERENCES usuario (idUsuario,emailUsuario)
);



CREATE TABLE lugar (
 idLugar INT NOT NULL AUTO_INCREMENT,
 idUsuario INT NOT NULL,
 emailUsuario VARCHAR(50) NOT NULL,
 nomeLugar VARCHAR(50) NOT NULL,
 enderecoLugar VARCHAR(100) NOT NULL,
 bairroLugar VARCHAR(50) NOT NULL,
 cidadeLugar VARCHAR(50) NOT NULL,
 tipoLugar VARCHAR(50),
 descricaoLugar VARCHAR(255),
 PRIMARY KEY (idLugar,idUsuario,emailUsuario),
 FOREIGN KEY (idUsuario,emailUsuario) REFERENCES usuario (idUsuario,emailUsuario)
);



CREATE TABLE compromisso (
 idCompromisso INT NOT NULL AUTO_INCREMENT,
 idUsuario INT NOT NULL,
 emailUsuario VARCHAR(50) NOT NULL,
 idContato INT NOT NULL,
 idLugar INT NOT NULL,
 nomeCompromisso VARCHAR(50) NOT NULL,
 descricaoCompromisso VARCHAR(100),
 dataCompromisso DATE NOT NULL,
 horaCompromisso VARCHAR(5) NOT NULL,
 dataNotificacaoCompromisso DATE NOT NULL,
 mensagemCompromisso VARCHAR(255),
 PRIMARY KEY (idCompromisso,idUsuario,emailUsuario,idContato,idLugar),
 FOREIGN KEY (idUsuario,emailUsuario) REFERENCES usuario (idUsuario,emailUsuario),
 FOREIGN KEY (idContato) REFERENCES contato (idContato),
 FOREIGN KEY (idLugar) REFERENCES lugar (idLugar)
);


ALTER TABLE `djenda`.`usuario` 
ADD UNIQUE INDEX `usuario_UNIQUE` (`idUsuario` ASC, `emailUsuario` ASC);


ALTER TABLE `djenda`.`lugar` 
ADD UNIQUE INDEX `lugar_UNIQUE` (`idLugar` ASC, `idUsuario` ASC, `emailUsuario` ASC);


ALTER TABLE `djenda`.`contato` 
ADD UNIQUE INDEX `contato_UNIQUE` (`idContato` ASC, `idUsuario` ASC, `emailUsuario` ASC);


ALTER TABLE `djenda`.`compromisso` 
ADD UNIQUE INDEX `compromisso_UNIQUE` (`idCompromisso` ASC, `idUsuario` ASC,
                `emailUsuario` ASC, `idContato` ASC, `idLugar` ASC);
                


ALTER TABLE `sql10208877`.`usuario` 
ADD UNIQUE INDEX `usuario_UNIQUE` (`idUsuario` ASC, `emailUsuario` ASC);


ALTER TABLE `sql10208877`.`lugar` 
ADD UNIQUE INDEX `lugar_UNIQUE` (`idLugar` ASC, `idUsuario` ASC, `emailUsuario` ASC);


ALTER TABLE `sql10208877`.`contato` 
ADD UNIQUE INDEX `contato_UNIQUE` (`idContato` ASC, `idUsuario` ASC, `emailUsuario` ASC);


ALTER TABLE `sql10208877`.`compromisso` 
ADD UNIQUE INDEX `compromisso_UNIQUE` (`idCompromisso` ASC, `idUsuario` ASC,
                `emailUsuario` ASC, `idContato` ASC, `idLugar` ASC);