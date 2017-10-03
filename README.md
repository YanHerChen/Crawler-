# Crawler-蘋果新聞頁面下載

Crawler Project 僅作同步下載  
之後將開發URL 自動搜索，配合Crawler Project 進行通用版網路爬蟲  
故目前URL 是寫死在PageManager.class  
  
  
實作說明
  
  
MultiThread
- 同步下載蘋果新聞頁面
- newCachedThreadPool 搭配 Semaphore 實作  
  
  
PageManager.class
- 暫時寫定要抓取的網址
- 以 AtomicInteger 控制url陣列  
  
  
DownloadWeb.class
- 做輸出html頁面，可做輸出位置修改
- File file = new File("D:/Apple/"+fn.getn()+".html");  
  
  
LinkedHash.class
- 做 html 內碼暫存  
- 以LinkedHashMap 實作儲存  
  目的在於、同步抓取會遇到資料混雜的狀況  
  所以在 Crawler 作讀取 html 內碼時，會給予標籤  
  以便 LinkedHashMap 作頁面區分  
  
    
Crawler Project 是我從大二暑假練習爬蟲時、陸續修改至今(大四)的學習整理  
