DROP TABLE IF EXISTS sys_user;

CREATE TABLE sys_user
(
  id       int primary key auto_increment,
  name     varchar COMMENT '商品id',
  password varchar COMMENT '商品名称'
);