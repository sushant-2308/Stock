# Stock 👋

## Frameworks and Language used:
 - Spring
 - Spring boot
 - My-Sql
 - Java


 ## Data Flow

 #### Controller
 ---Stock----
 - getStocksBasedOnType
 - getStocksAbovePriceAndLowerDate
 - getAllStocksAboveMarketCap
 - insertStocks
 - insertStocks
 - updateTypeById
 - updateStockById
 - removeStocksByOwnerCount

 #### Service
  ---Stock----
 - getStocksByType
 - addStocks
 - getStocksAbovePriceAndLowerDate
 - getAllStocksAboveMarketCap
 - updateMarketCap
 - deleteStocksBasedOnCount
 - updateTypeById
 - updateStockById

 #### Model
 ---Stock----
 - stockId
 - stockName
 - stockPrices
 - stockOwnerCount
 - stockType
 - stockMarketCap
 - stockBirthTimeStamp

 #### Repository
 ---Stock----
 - findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName
 - getAllStocksAboveMarketCap
 - updateMarketCapById
 - deleteStocksBasedOnCount
 - modifyStockTypeById
 - updateStockById

### Project Summary
Created a simple Stock application in which you can check and store the price,name,stockBirthDate and other different attributes or porperties of a stock Model.In simple terms its a stock management application to manage data and performs operations on any stock.

### How to use in your system?
 - Just Simply clone this reposit
 - Start your server
 - Perform operations 
