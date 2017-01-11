package by.it.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Лёша on 01.11.2016.
 */
abstract public class Action {
        abstract public String execute(HttpServletRequest reg);

        @Override
        public String toString() {
                String name=this.getClass().getSimpleName();
                name=name.replace("Cmd","");
                return name;
        }

        public String getJsp(String name){
               // String name = this.toString().toLowerCase();
                return "/"+name+".jsp";
        }
}
