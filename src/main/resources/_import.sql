insert into papel (id, nome) values (1, 'CADASTRANTE');
insert into papel (id, nome) values (2, 'COMERCIAL');

insert into usuario (id, matricula, nome, senha) values (1, '000001', 'João da Silva', '$2a$10$b8hsGmxsdOjJQI9wMIjQAeP.P59lEjqkYtp6Ul19H1.Us7GuYPv.S');
insert into usuario (id, matricula, nome, senha) values (2, '000002', 'Marcos Ribeiro', '$2a$10$b8hsGmxsdOjJQI9wMIjQAeP.P59lEjqkYtp6Ul19H1.Us7GuYPv.S');
insert into usuario (id, matricula, nome, senha) values (3, '451161', 'Guilherme Santos', '$2a$10$b8hsGmxsdOjJQI9wMIjQAeP.P59lEjqkYtp6Ul19H1.Us7GuYPv.S');

-- CADASTRANTES
insert into usuario_papel (usuario_id, papel_id) values (1, 1);
insert into usuario_papel (usuario_id, papel_id) values (2, 1);

-- COMERCIAL
insert into usuario_papel (usuario_id, papel_id) values (3, 2);

insert into imovel (id, matricula, visita, localidade, setor, quadra, rota, sequencia, sublote, testada, logradouro, cep, bairro, numero, complemento) values (1, '532061', 0, 111, 105, 33, 33, 1, 0, 0, 'AV M', '65000000', 'RADIONAL', '00002', 'HABITADO');
insert into imovel (id, matricula, visita, localidade, setor, quadra, rota, sequencia, sublote, testada, logradouro, cep, bairro, numero, complemento) values (2, '532070', 0, 111, 105, 33, 33, 2, 0, 0, 'AV M', '65000000', 'RADIONAL', '00004', 'HABITADO');
insert into imovel (id, matricula, visita, localidade, setor, quadra, rota, sequencia, sublote, testada, logradouro, cep, bairro, numero, complemento) values (3, '532088', 0, 111, 105, 33, 33, 3, 0, 0, 'AV M', '65000000', 'RADIONAL', '00006', 'HABITADO');

-- ROTEIRO PARA CADASTRANTE 000001
insert into roteiro (id, usuario_id, cadastrante_id, status, rota, localidade) values (1, 3, 1, 'CRIADO', 33, 111);
insert into roteiro_imovel (roteiro_id, imovel_id) values (1, 1);
insert into roteiro_imovel (roteiro_id, imovel_id) values (1, 2);
