create schema geekbang collate utf8mb4_unicode_ci;

create table geekbang.g_column
(
    id              bigint auto_increment comment '主键'
        primary key,
    column_sku      int null comment 'gk专栏id',
    title           varchar(200) null comment '标题',
    subtitle        varchar(200) null comment '子标题',
    count           int null comment '总讲数量',
    curr_count      int null comment '已更新的数量',
    catalog_pic_url varchar(200) null comment '目录图片url',
    constraint g_column_column_sku_uindex
        unique (column_sku)
) charset = utf8mb4;

create table geekbang.g_column_chapter
(
    id            bigint auto_increment comment '主键'
        primary key,
    column_sku    int null comment '专栏id',
    chapter_id    int null comment '章节id',
    source_id     int null,
    title         varchar(100) null comment '标题',
    article_count int null comment '标题下文章数量',
    constraint g_column_chapter_column_sku_chapter_id_uindex
        unique (column_sku, chapter_id)
) comment '专栏下的章节信息';

create table geekbang.g_column_content
(
    id                 bigint auto_increment
        primary key,
    column_sku         int null comment '专栏id',
    directory_id       int null comment '目录id',
    audio_url          varchar(100) null comment '音频url',
    audio_title        varchar(100) null comment '音频标题',
    audio_time         varchar(10) null comment '音频时间',
    audio_download_url varchar(100) null comment '音频下载url',
    chapter_id         int null comment '章节id',
    article_content    text null comment '文章详细内容',
    article_title      varchar(100) null comment '文章标题',
    article_sharetitle varchar(100) null comment '文章标题2'
) comment '专栏文章内容';

create table geekbang.g_column_content_fail
(
    id           bigint auto_increment
        primary key,
    sku          int null,
    directory_id int null
) comment '插入失败表';

create table geekbang.g_column_directory
(
    id              bigint auto_increment
        primary key,
    column_sku      int null comment '专栏id',
    chapter_id      int null comment '章节id',
    directory_id    int null comment '目录id',
    article_title   varchar(100) null comment '目录标题',
    article_summary varchar(200) null,
    audio_time      varchar(20) null comment '音频时间',
    audio_title     varchar(100) null comment '音频标题',
    audio_url       varchar(100) null comment '音频url',
    constraint g_column_directory_column_sku_chapter_id_directory_id_uindex
        unique (column_sku, chapter_id, directory_id)
) comment '专栏目录';

