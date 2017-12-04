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
 FOREIGN KEY (idUsuario,emailUsuario) REFERENCES Usuario (idUsuario,emailUsuario)
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
 FOREIGN KEY (idUsuario,emailUsuario) REFERENCES Usuario (idUsuario,emailUsuario)
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
 FOREIGN KEY (idUsuario,emailUsuario) REFERENCES Usuario (idUsuario,emailUsuario),
 FOREIGN KEY (idContato) REFERENCES Contato (idContato),
 FOREIGN KEY (idLugar) REFERENCES Lugar (idLugar)
);


ALTER TABLE `djenda`.`usuario` 
ADD UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC),
ADD UNIQUE INDEX `emailUsuario_UNIQUE` (`emailUsuario` ASC);


ALTER TABLE `djenda`.`lugar` 
ADD UNIQUE INDEX `idLugar_UNIQUE` (`idLugar` ASC),
ADD UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC),
ADD UNIQUE INDEX `emailUsuario_UNIQUE` (`emailUsuario` ASC);


ALTER TABLE `djenda`.`contato` 
ADD UNIQUE INDEX `idContato_UNIQUE` (`idContato` ASC),
ADD UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC),
ADD UNIQUE INDEX `emailUsuario_UNIQUE` (`emailUsuario` ASC);


ALTER TABLE `djenda`.`compromisso` 
ADD UNIQUE INDEX `idCompromisso_UNIQUE` (`idCompromisso` ASC),
ADD UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC),
ADD UNIQUE INDEX `emailUsuario_UNIQUE` (`emailUsuario` ASC),
ADD UNIQUE INDEX `idContato_UNIQUE` (`idContato` ASC),
ADD UNIQUE INDEX `idLugar_UNIQUE` (`idLugar` ASC);
