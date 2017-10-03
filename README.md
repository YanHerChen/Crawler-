# Crawler-蘋果新聞頁面下載

Crawler Project僅作同步download  
之後將開發URL自動搜尋，配合Crawler Project進行通用版網路爬蟲  
故目前Crawler Project的網址是寫死在PageManager.class裏頭  
  
  
實作說明
  
  
MultiThread
- 同步下載蘋果新聞頁面
- newCachedThreadPool搭配Semaphore 實作  
  
  
PageManager.class
- 暫時寫定要抓取的網址
- 以AtomicInteger控制url陣列  
  
  
DownloadWeb.class
- 做輸出html頁面，可做輸出位置修改
- File file = new File("D:/Apple/"+fn.getn()+".html");  
  
  
LinkedHash.class
- 做html內碼暫存  
- 以LinkedHashMap實作儲存  
  目的在於、同步抓取會遇到資料混雜的狀況  
  所以在Crawler作讀取html內碼時，會給予標籤  
  以便LinkedHashMap作頁面區分  
  
  
    
Crawler Project是我從大二暑假練習爬蟲時、陸續撰寫至今(大四)的學習整理
