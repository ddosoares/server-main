package Services;

import Model.District;

public interface Services<T>{

   T getBestMatch(Integer bombasticLevel, District district);

}
