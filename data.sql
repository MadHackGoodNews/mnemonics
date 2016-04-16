drop table if exists users;
create table users(
	userID integer not null auto_increment,
	username varchar(20) not null,
	email varchar(20) not null,
    birthday date,
	password varchar(20),
    intro varchar(50),
    follow integer,
    followed integer,
    picPath varchar(50),
    phoneNum varchar(20),
	primary key(userID)
)default charset utf8;

drop table if exists plan;
create table plan(
    planID integer not null auto_increment,
    mytime_start date,
    mytime_end date,
    destination varchar(20) not null,
    cost integer,
    content varchar(100),
    coverPath varchar(50),
    title varchar(20),
    maxPeople integer default -1,
    havingPeople integer default 1,
    mylike integer,
    primary key(planID)
)default charset utf8;

drop table if exists route;
create table route(
    routeID integer not null auto_increment,
    mytime time,
    destination varchar(20) not null,
    cost integer,
    coverPath varchar(50),
    tag varchar(100),
    title varchar(50),
    score real,
    primary key(routeID)
)default charset utf8;

drop table if exists comment;
create table comment(
    commentID integer not null auto_increment,
    mytime date,
    content varchar(2000),
    score integer,
    userID integer,
    primary key(commentID)
)default charset utf8;

drop table if exists follow;
create table follow(
	userID integer,
    fansID integer
)default charset utf8;







-- insert Users(username, email, password, follow, followed, intro) values('sophia', 'sophia@gmail.com', 'aaaaaa', '1', '3', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('usera', 'sophia@qq.com', 'aaaaaa', '1', '1', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('userb', 'b@gmail.com', 'aaaaaa', '1', '1', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('userc', 'c@gmail.com', 'aaaaaa', '2', '0', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('userd', 'd@gmail.com', 'aaaaaa', '0', '0', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('usere', 'e@gmail.com', 'aaaaaa', '0', '0', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('userf', 'f@gmail.com', 'aaaaaa', '0', '0', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('userg', 'g@gmail.com', 'aaaaaa', '0', '0', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('userh', 'h@gmail.com', 'aaaaaa', '0', '0', '暂无');
-- insert Users(username, email, password, follow, followed, intro) values('i是我', 'i@gmail.com', 'aaaaaa', '0', '0', '暂无');
-- insert question(title, username, time, update_time, description, ansSum) values('title1','sophia','2014-11-19 04:28:03', '2015-03-17 03:23:24', 'description1', '1');
-- insert question(title, username, time, update_time, description, ansSum) values('title2','usera', '2015-01-29 04:20:07', '2015-01-29 04:20:07', 'description2', '0');
-- insert question(title, username, time, update_time, description, ansSum) values('title3','i是我', '2015-03-18 14:40:19', '2015-04-17 03:23:24', 'description3', '3');
-- insert answer(questionID, username, time, description, commentSum) values('1', 'usera', '2015-03-17 03:23:24', 'my answer1', '1');
-- insert answer(questionID, username, time, description, commentSum) values('3', 'userb', '2015-03-21 12:28:17', 'Google上搜索Furious 7，目前最热的一个词条是：Did the ending make you cry？ 
--     					<br><br>
--     					　　"Yes. It did."我会发自内心的这样说。 <br>　　速度与激情。至今为止一共七部了。之前给我印象最深的是第五部，相对而言，在同类型电影中它是比较新颖的一部，节奏快、场面大、一气呵成，剧情清晰明朗，逻辑不自相矛盾。对于商业片，尤其是以＂车+动作＂为载体的商业片，需要这样的干脆直接。 <br><br>　　本以为只有第五部是一个惊喜，但之前我一直不怎么看好的第七部今天看完后，反而改变了我的想法。', '0');
-- insert answer(questionID, username, time, description, commentSum) values('3', 'usera', '2015-04-01 05:03:07', 'my answer2', '0');
-- insert answer(questionID, username, time, description, commentSum) values('3', 'userc', '2015-04-17 03:23:24', 'my answer4', '0');
-- insert comment(ansID, username, time, description) values('1', 'userb', '2015-05-17 03:23:24', "my comment");
-- insert Relation(userID,fansID) values('1', '2');
-- insert Relation(userID,fansID) values('2', '1');
-- insert Relation(userID,fansID) values('1', '3');
-- insert Relation(userID,fansID) values('1', '4');
-- insert Relation(userID,fansID) values('3', '4');
-- update Users user set user.picPath="image/avatar/default.png" where user.userID=1;
-- update Users user set user.picPath="image/user1.png" where user.userID=2;
-- update Users user set user.picPath="image/user2.png" where user.userID=3;
-- update Users user set user.picPath="image/user4.png" where user.userID=4;
-- update Users user set user.picPath="image/user5.png" where user.userID=5;
-- update Users user set user.picPath="image/user7.png" where user.userID=6;
-- update Users user set user.picPath="image/user8.png" where user.userID=7;
-- update Users user set user.picPath="image/user9.png" where user.userID=8;
-- update Users user set user.picPath="image/user3.png" where user.userID=9;
-- update Users user set user.picPath="image/avatar/default.png" where user.userID=10;