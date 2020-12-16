# 인터뷰 준비
  
## 일반

### Design Pattern

### Software Architecture


## Android

### Architecture

* Android Application Architecture (Android Dev Summit 2015) : https://www.youtube.com/watch?v=BlkJzgjzL0c
  * Architecture는 User Experience에 영향을 미친다. 초반에 적용하는게 영향성이 가장 적다.
  * View - View Controller - Persistent Model - Application Logic - Network (Design for offline)
  * Background Process도 Local과 Network 연결 포함하는 Global Sync 스레드 분리 (Task Queue) 
* Build a modular Android app architecture (Google I/O'19) : https://www.youtube.com/watch?v=PZBg5DIzNww
  * module : library module, dynamic feature module
  * module by feature, module by layer

