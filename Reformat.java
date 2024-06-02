class Reformat {
    public String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> alphas = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                digits.add(ch);
            }else{
                alphas.add(ch);
            }
        }

        if(Math.abs(alphas.size()-digits.size())>1){
            return "";
        }
        String out = "";
        if(alphas.size() > digits.size()){
            int i = 0;
            int j = 0;
            while(i<alphas.size() && j<digits.size()){
                out += alphas.get(i++);
                out += digits.get(j++);
            }
            out += alphas.get(i);
        }else{
            int i = 0;
            int j = 0;
            while(i<digits.size() && j<alphas.size()){
                out += digits.get(i++);
                out += alphas.get(j++);
            }
            if(i < digits.size()){
                out += digits.get(i);
            }
        }
        return out;
    }
}
