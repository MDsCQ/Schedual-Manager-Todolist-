create table s_admin
(
    uaid          int auto_increment
        primary key,
    adminname     varchar(255) not null,
    adminpassword varchar(255) not null
)
    comment 'tablet include all administrators' collate = utf8mb4_bin;

grant alter on table s_admin to 'JavaWeb-T';

create table s_request
(
    uid          int auto_increment
        primary key,
    username     varchar(255) not null,
    userpassword varchar(255) not null
)
    comment 'tablet include all signup account' collate = utf8mb4_bin;

create table s_user
(
    uid          int auto_increment
        primary key,
    username     varchar(255) not null,
    userpassword varchar(255) not null,
    permissionid int          not null,
    constraint s_user_s_admin_uaid_fk
        foreign key (permissionid) references s_admin (uaid)
)
    comment 'tablet include all users' collate = utf8mb4_bin;

create table scheofuid1
(
    uscheid  int auto_increment
        primary key,
    tital    varchar(255) not null,
    addtime  date         not null,
    deadline date         not null,
    state    varchar(255) null
);



