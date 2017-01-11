package by.it.controller;

import by.it.controller.cmd.*;

import javax.servlet.http.HttpServletRequest;

public enum Actions {
      INDEX {{
          this.action = new CmdIndex();
      }},
      DELIVERY {{
          this.action = new CmdDelivery();
      }},
      PAYMENT {{
         this.action = new CmdPayment();
      }},
      CONTACTS {{
         this.action = new CmdContacts();
      }},

      LOGIN {{
          this.action = new CmdLogin();
      }},
      SIGNUP {{
         this.action = new CmdSignUp();
      }},
      LOGOUT {{
          this.action = new CmdLogout();
      }},
      MYBASKET {{
          this.action = new CmdMyBasket();
      }},
      MYORDERS {{
          this.action = new CmdMyOrders();
      }},
      MYLIKED {{
          this.action = new CmdMyLiked();
      }},
      ADDTOBASKET {{
          this.action = new CmdAddToBasket();
      }},
      ADDTOLIKED{{
          this.action = new CmdAddToLiked();
      }},
      BUY {{
          this.action = new CmdBuy();
      }},
      DELETE {{
         this.action = new CmdDelete();
      }},
      VIEWGOODS {{
          this.action = new CmdViewGoods();
      }},
    ERROR {{
        this.action = new CmdError();
    }};
//    ADMINCAB {{
//        this.action = new CmdAdminCab();
//    }};

    protected Action action = null;

    static Action defineFrom(HttpServletRequest req) {
        Action result = Actions.INDEX.action;
        String cmdName = req.getParameter("command");
        if (cmdName!=null)
            try {
                result = Actions.valueOf(cmdName.toUpperCase()).action;
            } catch (IllegalArgumentException e) {
                result = Actions.ERROR.action;
            }
        return result;
    }

}
