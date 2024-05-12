# Втора лабораториска вежба по Софтверско инженерство

## Давид Ѓоргиев, бр. на индекс 213095

### Control Flow Graph
https://github.com/DavidGjorgiev314/SI_2024_lab2_213095/blob/master/cfg.png

### Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

### Тест случаи според критериумот Every statement
1. **Branch 1**: `if (allItems == null)`

   - Тест Случај 1: `allItems` листата е `null`.
   - Тест Случај 2: `allItems` листата не е `null`.

2. **Branch 2**: `for (int i = 0; i < allItems.size(); i++)`

   - Тест Случај 3: `item` има `null` име.
   - Тест Случај 4: `item` има празно име.
   - Тест Случај 5: `item` има non-null, non-empty име.

2. **Branch 2**: `if (item.getName() == null || item.getName().length() == 0)`

   - Тест Случај 3: `item` има `null` име.
   - Тест Случај 4: `item` има празно име.
   - Тест Случај 5: `item` има non-null, non-empty име.

3. **Branch 3**: `if (item.getBarcode() != null)`

   - Тест Случај 6: `item` има non-`null` barcode.
   - Тест Случај 7: `item` има `null` barcode.

4. **Branch 4**: `if (allowed.indexOf(c) == -1)`

   - Тест Случај 8: `item` има валиден barcode.
   - Тест Случај 9: `item` има невалиден barcode.

5. **Branch 5**: `if (item.getDiscount() > 0)`

   - Тест Случај 10: `item` има discount поголем од 0.
   - Тест Случај 11: `item` има discount еднаков на 0.
   - Тест Случај 12: `item` има discount помал од 0.
   - Тест Случај 13: `item` discount е NaN.

6. **Branch 6**: `if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')`

   - Тест Случај 14: `item` има price > 300, discount > 0, and barcode starting with '0'.
   - Тест Случај 15: `item` има price <= 300.
   - Тест Случај 16: `item` има discount <= 0.
   - Тест Случај 17: `item` има barcode што не почнува со '0'.

7. **Branch 7**: `if (sum <= payment)`

   - Test Case 18: `payment` е поголем или еднаков на `sum`.
   - Test Case 19: `payment` е помал од `sum`.
