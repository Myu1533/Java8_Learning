#!/bin/bash
ServerHost=10.1.104.5
ServerPort=3306
ServerUser=root
ServerPassword=qweASDzxc!23

LocalHost=localhost
LocalPort=3306
LocalUser=htqh-mac
LocalPassword=

mysqldump -h$ServerHost -P$ServerPort -u$ServerUser -p$ServerPassword htqh_strategy t_instrument_info > data-dump.sql

mysql -u$LocalUser htqh_strategy < data-dump.sql