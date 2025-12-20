package J05063;

import java.util.*;

public class DaThuc {
    private Map<Integer, Integer> x;

    public DaThuc(String s){
        x = new TreeMap<>();
        String[] nums = s.replaceAll("[^0-9]", " ").split("\\s+");
        for (int i = 0; i < nums.length; i += 2){
            x.put(Integer.parseInt(nums[i + 1]), Integer.parseInt(nums[i]));
        }
    }

    public DaThuc cong(DaThuc o){
        for (Map.Entry<Integer, Integer> val : o.x.entrySet()){
            this.x.put(val.getKey(), x.getOrDefault(val.getKey(), 0) + val.getValue());
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Integer> soMuList = new ArrayList<>(x.keySet());
        Collections.sort(soMuList, Collections.reverseOrder());
        for (Integer soMu : soMuList) {
            int heSo = x.get(soMu);
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(heSo).append("*x^").append(soMu);
        }
        return sb.toString();
    }
}
