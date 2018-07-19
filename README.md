加強Lab 8的程式，完成兩項工作：
- 在玩遊戲的時候，對 “You Win/Loose!” 的 TextView 用 background thread 更新進行的秒數。遊戲結束時，則顯示 “You Win/Loose!” 的結果。
- 遊戲結束時，如果秒數在前五名內，則顯示另一個畫面，讓使用者用一個 EditText 輸入姓名。輸入完畢，姓名 (TEXT) 及秒數結果 (INTEGER) 會存到一個 score 的資料庫中。如果 有同秒數的情況，則排在同秒數的最後面。而 ListView 中的 “Record” 選項，要顯示出最快的前五名，按照秒數由小至大排列。 在輸入姓名時， ListView 的按鍵必須失效，一直等到輸入姓名完畢按下 “OK” 為止。
其他畫面作少許變動。在遊戲畫面中，如果玩家勝利，也要顯示最快時間與玩家的時間。

垂直畫面與水平畫面分別如下圖所示：

## 垂直畫面
![image](https://github.com/veryjimmy/android_lab9/blob/master/ex1.png)

![image](https://github.com/veryjimmy/android_lab9/blob/master/ex2.png)

![image](https://github.com/veryjimmy/android_lab9/blob/master/ex3.png)
<br/>
## 水平畫面
![image](https://github.com/veryjimmy/android_lab9/blob/master/ex4.png)