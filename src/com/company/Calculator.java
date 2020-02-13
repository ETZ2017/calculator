package com.company;


import java.util.logging.Logger;

/*
* Header
* Kryklyvets Yevheniia
* 13.02.20
* */

public class Calculator {
    private String valueF;
    private String valueS;
    private Logger log;

    public Calculator() {
    }

    public Calculator(String valueF, String valueS) {
        this.valueF = valueF;
        this.valueS = valueS;
        log = Logger.getLogger(Main.class.getName());
    }

    public String getValueF() {
        return valueF;
    }

    public void setValueF(String valueF) {
        this.valueF = valueF;
    }

    public String getValueS() {
        return valueS;
    }

    public void setValueS(String valueS) {
        this.valueS = valueS;
    }

    public String cons1() {
        if(this.valueF == "True" && this.valueS == "True") {
            log.info("Check if both values are True");
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")){
                log.info("If true then True");
                return "True";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")){
                    log.info("If true then True");
                    return "True";
                }

                else {
                    log.info("Check if both values are False");
                    if(this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: Null";*/
                        return "True";
                    }
                    else {
                        log.info("Check if none of this then True");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: 0";*/
                        return "True";
                    }
                }
            }
        }
       /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                "Constant 1 of it equals to: 1";*/
    }

    public String cons0() {
        if(this.valueF == "True" && this.valueS == "True") {
            log.info("Check if both values are True");
            log.info("If true then False");
            return "True";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")){
                log.info("If true then False");
                return "False";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")){
                    log.info("If true then False");
                    return "False";
                }

                else {
                    log.info("Check if both values are Null");
                    if(this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: Null";*/
                        log.info("If true then False");
                        return "False";
                    }
                    else {
                        log.info("Check if none of this");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: 0";*/
                        log.info("If true then False");
                        return "False";
                    }
                }
            }
        }
    }

    public String conj() {
        if(this.valueF == "True" && this.valueS == "True") {
            log.info("Check if both values are True");
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Conjunction of it equals to: 1";*/
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")){
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Conjunction of it equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")){
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Conjunction of it equals to: 0";*/
                    log.info("If true then False");
                    return "False";
                }

                else {
                    log.info("Check if both values are Null");
                    if(this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    }
                    else {
                        log.info("Check if none of this");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: 0";*/
                        log.info("If true then False");
                        return "False";
                    }
                }
            }
        }
    }

    public String disj() {
        if(this.valueF == "False" && this.valueS == "False") {
            log.info("Check if both values are False");
            log.info("If true then False");
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Disjunction of it equals to: 0";*/
            return "False";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")){
               /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Disjunction of it equals to: 1";*/
                log.info("If true then True");
                return "True";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")) {
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Disjunction of it equals to: Null";*/
                    log.info("If true then Null");
                    return "Null";
                } else {
                    log.info("Check if both values are Null");
                    if (this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Disjunction of it equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    } else {
                        log.info("Check if none of these");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Disjunction of it equals to: 1";*/
                        log.info("If true then True");
                        return "True";
                    }
                }
            }
        }
    }

    public String noImplAB() {
        if(this.valueF == "True" && this.valueS == "False") {
            log.info("Check if first value is True and second is False");
           /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Not implication of A to B equals to: 1";*/
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if first value is Null and second is False");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")){
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Not implication of A to B equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if second value is True and first is Null");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")) {
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Not implication of A to B equals to: 0";*/
                    log.info("If true then False");
                    return "False";
                } else {
                    log.info("Check if both values are Null");
                    if (this.valueF == "Null" && this.valueS == "Null") {
                       /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Not implication of A to B equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    } else {
                        log.info("Check if none of these");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Not implication of A to B equals to: 0";*/
                        log.info("If true then False");
                        return "False";
                    }
                }
            }
        }
    }

    public String noImplBA() {
        if(this.valueF == "False" && this.valueS == "True") {
            log.info("Check if second value is True and first is False");
           /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Not implication of B to A equals equals to: 1";*/
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if first value is False and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "Null" && this.valueS == "True") || (this.valueF == "False" && this.valueS == "Null")){
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Not implication of B to A equals to: Null";*/
                log.info("If true then False");
                return "Null";
            }
            else {
                log.info("Check if first value is True and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "Null" && this.valueS == "False") || (this.valueF == "True" && this.valueS == "Null")) {
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Not implication of B to A equals to: 0";*/
                    log.info("If true then False");
                    return "False";
                } else {
                    log.info("Check if both values are Null");
                    if (this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Not implication of B to A equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    } else {
                        log.info("Check if none of these");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Not implication of B to A equals to: 0";*/
                        log.info("If true then False");
                        return "False";
                    }
                }
            }
        }
    }

    public String implAB() {
        if(this.valueF == "True" && this.valueS == "False") {
            log.info("Check if first value is True and second is False");
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Implication of A to B equals to: 0";*/
            log.info("If true then False");
            return "False";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if first value is Null and second is False");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")){
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Implication of A to B equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if second value is True and first is Null");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")) {
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Implication of A to B equals to: 1";*/
                    log.info("If true then True");
                    return "True";
                } else {
                    log.info("Check if both values are Null");
                    if (this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Implication of A to B equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    } else {
                        log.info("Check if none of these");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Implication of A to B equals to: 1";*/
                        log.info("If true then True");
                        return "True";
                    }
                }
            }
        }
    }

    public String implBA() {
        log.info("Check if second value is True and first is False");
        if(this.valueF == "False" && this.valueS == "True") {
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Implication of B to A equals to: 0";*/
            log.info("If true then False");
            return "False";
        } else {
            log.info("Check if first value is False and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "Null" && this.valueS == "True") || (this.valueF == "False" && this.valueS == "Null")){
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Implication of B to A equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if first value is True and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "Null" && this.valueS == "False") || (this.valueF == "True" && this.valueS == "Null")) {
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Implication of B to A equals to: 1";*/
                    log.info("If true then True");
                    return "True";
                } else {
                    log.info("Check if both values are Null");
                    if (this.valueF == "Null" && this.valueS == "Null") {
                       /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Implication of B to A equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    } else {
                        log.info("Check if none of these");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Implication of B to A equals to: 1";*/
                        log.info("If true then True");
                        return "True";
                    }
                }
            }
        }
    }

    public String revA() {
        log.info("Check if first is False");
        if(this.valueF == "False") {
            /*return "Value 1: " + this.getValueF() + '\n' +
                    "Not A equals to: 1";*/
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if first is Null");
            if(this.valueF == "Null") {
                /*return "Value 1: " + this.getValueF() + '\n' +
                        "Not A equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if none of these");
                /*return "Value 1: " + this.getValueF() + '\n' +
                        "Not A equals to: 0";*/
                log.info("If true then False");
                return "False";
            }
        }

    }

    public String revB() {
        log.info("Check if second is False");
        if(this.valueS == "False") {
            /*return "Value 2: " + this.getValueS() + '\n' +
                    "Not B equals to: 1";*/
            log.info("If true then Null");
            return "True";
        } else {
            log.info("Check if second is False");
            if(this.valueS == "Null") {
                /*return "Value 2: " + this.getValueS() + '\n' +
                        "Not B equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if none of these");
               /* return "Value 2: " + this.getValueS() + '\n' +
                        "Not B equals to: 0";*/
                log.info("If true then False");
                return "False";
            }
        }

    }

    public String equity() {
        log.info("Check if both values are True");
        log.info("Check if both values are False");
        if((this.valueF == "False" && this.valueS == "False") || (this.valueF == "True" && this.valueS == "True") ) {
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Equity of it equals to: 1";*/
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if both values are Null");
            if(this.valueF == "Null" || this.valueS == "Null" ||
                    (this.valueF == "Null" && this.valueS == "Null")) {
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Equity of it of it equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else{
                log.info("Check if none of these");
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Equity of it of it equals to: 0";*/
                log.info("If true then False");
                return "False";
            }
        }

    }

    public String mod() {
        log.info("Check if both values are True");
        log.info("Check if both values are False");
        if((this.valueF == "False" && this.valueS == "False") || (this.valueF == "True" && this.valueS == "True")) {
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "XOR of it equals to: 0";*/
            log.info("If true then False");
            return "False";
        } else {
            log.info("Check if both values are Null");
            if(this.valueF == "Null" || this.valueS == "Null") {
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "XOR of it of it equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if none of these");
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "XOR of it of it equals to: 1";*/
                log.info("If true then True");
                return "True";
            }
        }

    }

    public String consA() {
        log.info("Check if first is False");
        if(this.valueF == "False") {
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Const A of it equals to: 0";*/
            log.info("If true then False");
            return "False";
        } else {
            log.info("Check if first is Null");
            if (this.valueF == "Null") {
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Const A of it equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            } else {
                log.info("Check if first is True");
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Const A of it equals to: 1";*/
                log.info("If true then True");
                return "True";
            }
        }
    }

    public String consB() {
        log.info("Check if second is False");
        if(this.valueS == "False") {
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "Const B of it equals to: 0";*/
            log.info("If true then False");
            return "False";
        } else {
            log.info("Check if second is Null");
            if (this.valueS == "Null") {
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Const B of it equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if second is True");
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Const B of it equals to: 1";*/
                log.info("If true then True");
                return "True";
            }
        }
    }

    public String pierce() {
        log.info("Check if both values are False");
        if(this.valueF == "False" && this.valueS == "False") {
            /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "NOR of it equals to: 1";*/
            log.info("If true then True");
            return "True";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if second value is True and first is Null");
            if ((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")) {
               /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "NOR of it equals to: 0";*/
                log.info("If true then False");
                return "False";
            } else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")) {
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "NOR of it equals to: Null";*/
                    log.info("If true then Null");
                    return "Null";
                } else {
                    log.info("Check if both values are Null");
                    if (this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "NOR of it equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    } else {
                        log.info("Check if none of these");
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "NOR of it equals to: 0";*/
                        log.info("If true then False");
                        return "False";
                    }
                }
            }
        }
    }

    public String shifer() {
        log.info("Check if both values are True");
        if(this.valueF == "True" && this.valueS == "True") {
           /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                    "NAND of it equals to: 0";*/
            log.info("If true then False");
            return "False";
        } else {
            log.info("Check if first value is True and second is Null");
            log.info("Check if second value is True and first is Null");
            if((this.valueF == "True" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "True")){
                /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                        "Conjunction of it equals to: Null";*/
                log.info("If true then Null");
                return "Null";
            }
            else {
                log.info("Check if first value is False and second is Null");
                log.info("Check if first value is Null and second is False");
                if ((this.valueF == "False" && this.valueS == "Null") || (this.valueF == "Null" && this.valueS == "False")){
                    /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                            "Conjunction of it equals to: 1";*/
                    log.info("If true then True");
                    return "True";
                }

                else {
                    log.info("Check if both values are Null");
                    if(this.valueF == "Null" && this.valueS == "Null") {
                        /*return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "Conjunction of it equals to: Null";*/
                        log.info("If true then Null");
                        return "Null";
                    }
                    else {
                        log.info("Check if none of these");
                       /* return "Value 1: " + this.getValueF() + '\n' + "Value 2: " + this.getValueS() + '\n' +
                                "NAND of it equals to: 1";*/
                        log.info("If true then True");
                        return "True";
                    }
                }
            }
        }
    }
}

