# Втора лабораториска вежба по Софтверско инженерство

## Давид Ѓоргиев, бр. на индекс 213095

### Control Flow Graph
https://github.com/DavidGjorgiev314/SI_2024_lab2_213095/blob/master/cfg.png

### Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

### Тест случаи според критериумот Every Branch
1. **Branch 1**: `if (allItems == null)`

   - Test Case 1: `allItems` листата е `null`.
   - Test Case 2: `allItems` листата не е `null`.

2. **Branch 2**: `i < allItems.size()`

   - Test Case 3: `i` е помало од `allItems.size()`.
   - Test Case 4: `i` e поголемо или еднакво на `allItems.size()`.
  
3. **Branch 3**: `if (sum <= payment)`

   - Test Case 5: `payment` е поголем или еднаков на `sum`.
   - Test Case 6: `payment` е помал од `sum`.

2. **Branch 4**: `if (item.getName() == null || item.getName().length() == 0)`

   - Test Case 7: `item` има `null` име.
   - Test Case 8: `item` има празно име.
   - Test Case 9: `item` има non-null, non-empty име.

3. **Branch 5**: `if (item.getBarcode() != null)`

   - Test Case 10: `item` има non-`null` barcode.
   - Test Case 11: `item` има `null` barcode.
  
4. **Branch 6**: `if (item.getBarcode() != null)`

   - Test Case 12: `item` има non-`null` barcode.
   - Test Case 13: `item` има `null` barcode.

4. **Branch 7**: `if (allowed.indexOf(c) == -1)`

   - Test Case 14: `item` има валиден barcode.
   - Test Case 15: `item` има невалиден barcode.

5. **Branch 8**: `if (item.getDiscount() > 0)`

   - Test Case 16: `item` има discount поголем од 0.
   - Test Case 17: `item` има discount помал или еднаков на 0.

6. **Branch 9**: `if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')`

   - Test Case 18: `item` има price > 300, discount > 0, and barcode starting with '0'.
   - Test Case 19: `item` има price <= 300.
   - Test Case 20: `item` има discount <= 0.
   - Test Case 21: `item` има barcode што не почнува со '0'.

### Тест случаи според критериумот Multiple Condition
1. **Тест случај кога сите услови се точни:**
     - Input: `item.getPrice() > 300`, `item.getDiscount() > 0`, `item.getBarcode().charAt(0) == '0'`
     - Output: `sum` ќе се намали за 30.

2. **Тест случај кога само првиот услов е неточен:**
     - Input: `item.getPrice() <= 300`, `item.getDiscount() > 0`, `item.getBarcode().charAt(0) == '0'`
     - Output: `sum` нема да се намали за 30.

3. **Тест случај кога само вториот услов е неточен:**
     - Input: `item.getPrice() > 300`, `item.getDiscount() <= 0`, `item.getBarcode().charAt(0) == '0'`
     - Output: `sum` нема да се намали за 30.

4. **Тест случај кога само третиот услов е неточен:**
     - Input: `item.getPrice() > 300`, `item.getDiscount() > 0`, `item.getBarcode().charAt(0) != '0'`
     - Output: `sum` нема да се намали за 30.

5. **Тест случај кога првиот и вториот услов се неточни:**
     - Input: `item.getPrice() <= 300`, `item.getDiscount() <= 0`, `item.getBarcode().charAt(0) == '0'`
     - Output: `sum` нема да се намали за 30.

6. **Тест случај кога првиот и третиот услов се неточни:**
     - Input: `item.getPrice() <= 300`, `item.getDiscount() > 0`, `item.getBarcode().charAt(0) != '0'`
     - Output: `sum` нема да се намали за 30.

7. **Тест случај кога вториот и третиот услов се неточни:**
     - Input: `item.getPrice() > 300`, `item.getDiscount() <= 0`, `item.getBarcode().charAt(0) != '0'`
     - Output: `sum` нема да се намали за 30.

8. **Тест случај кога сите услови се неточни:**
     - Input: `item.getPrice() <= 300`, `item.getDiscount() <= 0`, `item.getBarcode().charAt(0) != '0'`
     - Output: `sum` нема да се намали за 30.
  
### Објаснување на напишаните unit tests
- Според **Every Branch** критериумот, секоја гранка претставува еден предикатен јазел каде што се добива 1 од вкупно 2 можни outputs во зависност од тоа кој услов е исполнет во јазелот. Тест случаевите се сите можни варијации на внесен input кои или ќе го исполнат условот или не.
- Според **Multiple Condition** критериумот, тест случаевите се сите можни комбинации на внесен input кои или ќе ги исполнат повеќето услови во предикатниот јазел или не, исто така е дадено и следното извршување на кодот (output) врз база на исполнетите услови.


