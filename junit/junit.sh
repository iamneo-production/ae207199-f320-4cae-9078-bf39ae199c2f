#!/bin/bash
if [ -d "/home/coder/project/workspace/springapp/" ]
then
    echo "project folder present"
    # checking for src folder
    if [ -d "/home/coder/project/workspace/springapp/src/" ]
    then
        cp -r /home/coder/project/workspace/junit/test /home/coder/project/workspace/springapp/src/;
		cd /home/coder/project/workspace/springapp/;
		mvn clean test;
    else
        echo "BE_Add_User FAILED";
        echo "BE_Add_Profile FAILED";
        echo "BE_Get_Profile FAILED";
        echo "BE_Update_Profile FAILED";
    fi
else
	echo "BE_Add_User FAILED";
    echo "BE_Add_Profile FAILED";
    echo "BE_Get_Profile FAILED";
    echo "BE_Update_Profile FAILED";
fi
