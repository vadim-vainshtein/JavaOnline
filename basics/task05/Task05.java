/*
Задача 5: перевести время в секундах в формат
HHч MMм SSс

________
Замечания:

1. для экономии времени опущены какие-либо проверки входных данных
2.
*/

package basics.task05;

import basics.task05.time.Time;

public class Task05 {
  public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    String result = Time.formatTime(T);
    System.out.println(result);
  }
}
