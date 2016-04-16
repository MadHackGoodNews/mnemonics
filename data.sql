drop table if exists users;
create table users(
	userID integer not null auto_increment,
	username varchar(20) unique,
	email varchar(20) not null unique,
    birthday date,
	password varchar(20),
    intro varchar(50),
    follow integer,
    followed integer,
    picPath varchar(50),
    phoneNum varchar(20),
	primary key(userID).
	foreign key (Id) references Persons(userId)
)default charset utf8;

drop table if exists plan;
create table plan(
    planID integer not null auto_increment,
    userID integer,
    mytime_start date,
    mytime_end date,
    destination varchar(20) not null,
    cost integer,
    content varchar(100),
    coverPath varchar(50),
    title varchar(20),
    maxPeople integer default -1 ,
    havingPeople integer default 1,
    mylike integer,
    primary key(planID),
    foreign key (userId) references users(userId)
)default charset utf8;

drop table if exists route;
create table route(
    routeID integer not null auto_increment,
    userID integer,
    mytime varchar(20),
    destination varchar(20) not null,
    cost integer,
    coverPath varchar(50),
    tag varchar(100),
    title varchar(50),
    score real,
    primary key(routeID),
    foreign key (userId) references users(userId)
)default charset utf8;

drop table if exists comment;
create table comment(
    commentID integer not null auto_increment,
    mytime varchar(20),
    content varchar(2000),
    score integer,
    userID integer,
    primary key(commentID),
    foreign key (userId) references users(userId)
)default charset utf8;

drop table if exists follow;
create table follow(
	userID integer,
    fansID integer,
    foreign key (userId) references users(userId),
    foreign key (fansId) references users(userId)
)default charset utf8;
