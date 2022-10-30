## How to run the Java Server
Use gradle to start the Java Spring boot server by running
```shell
./gradlew bootRun
```
At this point, you should be able to run the API using terminal like this:
```shell
curl --location --request GET 'http://localhost:8080/medicines/'
```
where the port = 8080

## How to run the MySQL locally?

I used these tutorials online - [MySQL on Mac — Getting Started
](https://medium.com/macoclock/mysql-on-mac-getting-started-cecb65b78e)
I have been using MySQL Workbench for interacting with the database.

### Inserting the data in the database

Schema of the table:
```shell
'id','int','NO','PRI',NULL,'auto_increment'
'discountedPrice','float','YES','',NULL,''
'image','varchar(255)','YES','',NULL,''
'mrp','float','YES','',NULL,''
'name','varchar(255)','YES','',NULL,''
'quantity','varchar(255)','YES','',NULL,''
'ratingCount','varchar(255)','YES','',NULL,''
'ratings','varchar(255)','YES','',NULL,''

```

Data Insertions:

```roomsql
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Women's Multivitamin, Zinc, Vitamin C, Calcium, Vitamin D, and Iron  Immunity Booster Tablet",445,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/qh1au45w8u7cfvf3lg3i/tata-1mg-women-s-multivitamin-zinc-vitamin-c-calcium-vitamin-d-and-iron-immunity-booster-tablet.jpg", 995, "bottle of 60 tablets", "897 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Zincovit Tablet",90,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ibcufhk27uqhpgy9kfcg/zincovit-tablet.jpg", 105, "strip of 15 tablets", "6228 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Nutrabay Pro Active Multivitamin Men Capsule",310,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/aywb3kusfcv1tnyyt8qy/dr.-morepen-multi-vitamin-men-with-omega-3-herbs-natural-energy-immunity-booster-tablet.jpg", 699, "bottle of 60 capsules", "9 ratings","3.9");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Multivitamin Supreme, Zinc, Calcium and Vitamin D Immunity Booster Capsule",445,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/gmkrpf1imjj9djwvq4gq/tata-1mg-multivitamin-supreme-zinc-calcium-and-vitamin-d-immunity-booster-capsule.jpg", 995, "bottle of 60 capsules", "1083 ratings","4.2");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Wellman Health Supplement for Men Tablet",350,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/geiwxvovi2c600riqel3/wellman-health-supplement-for-men-tablet.jpg", 438, "strip of 30 tablets", "167 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Senior 50+ Multivitamin & Multimineral Immunity Booster Zinc, Vitamin C, Calcium, and Vitamin D Veg Tablet",445,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/klpj2khvaphkvpqmchui/tata-1mg-senior-50-multivitamin-multimineral-immunity-booster-zinc-vitamin-c-calcium-and-vitamin-d-veg-tablet.jpg", 895, "bottle of 60 tablets", "569 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Carbamide Forte Multivitamins with Probiotics Vegetarian Tablet",299,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/q33yrkqbjsquod6o63hj/nature-s-island-multivitamin-for-women-capsule.jpg", 375, "bottle of 60 tablets", "100 ratings","4.1");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Zingavita Multi Vitamins with Probiotics & Prebiotics Tablet",299,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/lnp1of3i2xo1c8tmwfyk/zingavita-multi-vitamins-with-probiotics-prebiotics-tablet.jpg", 499, "bottle of 120 tablets", "22 ratings","4.2");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Carbamide Forte Multivitamin with Probiotics & Ashwagandha Tablet",599,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ba72noylxk35qgj2eg5x/carbamide-forte-multivitamin-with-probiotics-ashwagandha-tablet.jpg", 850, "bottle of 180 tablets", "30 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Wellbeing Nutrition Daily Greens Effervescent Tablet (15 Each)",389,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/bhbkcdrdpdyuyivcxwpb/wellbeing-nutrition-daily-greens-effervescent-tablet-15-each.jpg", 590, "box of 1 Bottle", "5 ratings","4.2");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Nature's Island Multivitamin for Men Capsule",459,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/niilbcbb6dm0tkxvjzvg/nutribears-multivitamin-growth-immunity-support-gummies-gummy.jpg", 999, "bottle of 60 capsules", "12 ratings","4.8");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Myo-Inositol Tablet",298,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/4c2e528a65ce402892caa4944968540f/tata-1mg-myo-inositol-tablet.jpg", 595, "bottle of 30 tablets", "487 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Health OK Multivitamin & Multimineral Tablet Improves Energy, Overall Health & Immunity Tablet",129,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/n8qtlrzyyxtlhwrn4uyf/health-ok-multivitamin-multimineral-tablet-improves-energy-overall-health-immunity-tablet.jpg", 150, "strip of 15 tablets", "139 ratings","4.2");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("MuscleBlaze MB-Vite Multivitamin Tablet",529,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/dgcszilwgcv0dzorjzdk/muscleblaze-mb-vite-multivitamin-tablet.jpg", 699, "bottle of 60 tablets", "1745 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Supradyn Daily Multivitamin Tablet with Essential Zinc, 12 Vitamins, 5 Trace Elements for Daily Immunity & Energy",49,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/sqw5hcz291vua7utyqay/neuherbs-true-vitamin-tablet.jpg", 54.9, "strip of 15 tablets", "1745 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Supradyn Daily Multivitamin Tablet with Essential Zinc, 12 Vitamins, 5 Trace Elements for Daily Immunity & Energy",49,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/zaoniru9woncxf4acu5z/supradyn-daily-multivitamin-tablet-with-essential-zinc-12-vitamins-5-trace-elements-for-daily-immunity-energy.jpg", 54.9, "strip of 15 tablets", "60 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Carbamide Forte Multivitamins for Women with Probiotics Vegetarian Tablet",499,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/q58rjxdaynvly9s1xfj7/carbamide-forte-multivitamins-for-women-with-probiotics-vegetarian-tablet.jpg", 795, "bottle of 100 tablets", "287 ratings","4.6");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("A to Z NS+ Tablet",124,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/rbetoxazqzh3owohcceq/a-to-z-ns-tablet.jpg", 140, "strip of 15 tablets", "10 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Wellbeing Nutrition Melts Into Multi Vitamins Oral Thin Strip Sugar Free",519,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/szehgsekjxepwuzbkdcb/wellbeing-nutrition-melts-into-multi-vitamins-oral-thin-strip-sugar-free.jpg", 699, "box of 30 disintegrating strips", "13 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("GNC Women's One Daily Multivitamin Tablet",942,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/my1scryvvmp8purgjgpz/gnc-women-s-one-daily-multivitamin-tablet.jpg", 1449, "bottle of 60 tablets", "1737 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Revital H Woman Tablet",289,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/xqljyyelnecasglguvf6/revital-h-woman-tablet.jpg", 360, "bottle of 30 tablets", "214 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("HealthVit Cenvitan Men Multivitamin & Multimineral Tablet",299,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/a7xr3jsvuophvvsn7yua/healthvit-cenvitan-men-multivitamin-multimineral-tablet.jpg", 500, "bottle of 60 tablets", "2415 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("The Tiny Secret Multivitamin Chewable Tablet Bubblegum",290,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/hiidstzfeqei0fqujwll/nutrabay-pro-active-multivitamin-men-capsule.jpg", 349, "box of 30 Chewable Tablets", "25 ratings","4.2");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Revital H Capsule",442,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/jmuuryvgit6mwwolt0ea/revital-h-capsule.jpg", 550, "bottle of 60 soft gelatin capsules", "445 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Himalayan Organics Multivitamin with Probiotics Vegetarian Tablet",537,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/6ed03bfb04a142998e8868a819f4fb9f/himalayan-organics-multivitamin-with-probiotics-vegetarian-tablet.jpg", 955, "bottle of 180 tablets", "39 ratings","4.1");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Maxirich Multivitamin & Minerals Softgel",214,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/cropped/omz1zuuelyaqnupl0wwe/maxirich-multivitamin-minerals-softgel.png", 357, "box of 30 soft gelatin capsules", "2415 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Dr. Morepen Multi Vitamin Men with Omega 3 & Herbs, Natural Energy & Immunity Booster Tablet",689,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/xyy0payx0kdookapcmh3/nature-s-island-multivitamin-for-men-capsule.jpg", 999, "bottle of 60 tablets", "139 ratings","4.2");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Revital H Capsule",279,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/m6j6dbcf8ht96zbfqjuf/revital-h-capsule.jpg", 310, "bottle of 30 soft gelatin capsules", "897 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("MuscleBlaze MB-Vite Multivitamin Tablet",949,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/snrspytotzpdini6f0zh/muscleblaze-mb-vite-multivitamin-tablet.jpg", 1299, "bottle of 120 tablets", "30 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Women's Multivitamin, Zinc, Vitamin C, Calcium, Vitamin D, and Iron  Immunity Booster Tablet",245,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/jv4fjubstbcvlqyimatv/tata-1mg-women-s-multivitamin-zinc-vitamin-c-calcium-vitamin-d-and-iron-immunity-booster-tablet.jpg", 510, "bottle of 30 tablets", "59 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Carbamide Forte Multivitamin with Probiotics & Ashwagandha Tablet",599,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/zaoniru9woncxf4acu5z/supradyn-daily-multivitamin-tablet-with-essential-zinc-12-vitamins-5-trace-elements-for-daily-immunity-energy.jpg", 850, "bottle of 180 tablets", "67 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("HealthKart HK Vitals Multivitamin Women Tablet",549,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/pypjoepvlpoyoty22hi6/healthkart-hk-vitals-multivitamin-women-tablet.jpg", 999, "bottle of 90 tablets", "258 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Vitamin B Complex Capsules",319,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/olumjmbboursowikpgh9/tata-1mg-vitamin-b-complex-capsules.jpg", 595, "bottle of 60 capsules", "7 ratings","5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Maxirich Multivitamin & Minerals Softgel",54,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/cropped/rbxu2ons4awj3poppc6u/maxirich-multivitamin-minerals-softgel.png", 119, "strip of 10 soft gelatin capsules", "288 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Nature's Island Multivitamin for Women Capsule",468,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/1f1cdf16d57b4edfb814030206337f5f/health-veda-organics-multivitamin-with-probiotics-veg-tablet.jpg", 999, "bottle of 60 capsules", "436 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Revital H Woman Tablet",113,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/uiipbitqdljceyxoxbc1/revital-h-woman-tablet.jpg", 125, "strip of 10 tablets", "171 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Revital H Capsule",93,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/lspuygmjzzwp8xkxaefv/revital-h-capsule.jpg", 110, "strip of 10 soft gelatin capsules", "19 ratings","4.6");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("HealthKart HK Vitals Multivitamin Multimineral, Amino Acids ,Taurine & Ginseng Extract Tablet",549,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/grcvrktohcvunrfvytzd/healthkart-hk-vitals-multivitamin-multimineral-amino-acids-taurine-ginseng-extract-tablet.jpg", 950, "bottle of 90 tablets", "39 ratings","4.1");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("NutriBears Multivitamin Growth & Immunity Support Gummies Gummy",376,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/da2f9cd90f7947fabf9a39353e3b7f15/the-tiny-secret-multivitamin-chewable-tablet-bubblegum.jpg", 399, "bottle of 30 gummies", "140 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Dr. Morepen Multi Vitamin Men with Omega 3 & Herbs, Natural Energy & Immunity Booster Tablet",689,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/aywb3kusfcv1tnyyt8qy/dr.-morepen-multi-vitamin-men-with-omega-3-herbs-natural-energy-immunity-booster-tablet.jpg", 999, "bottle of 60 tablets", "43 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Calcium & Vitamin D Supplement Tablet",85,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/d71824667b96449b91be8b6a597cc2df/tata-1mg-calcium-vitamin-d-supplement-tablet.jpg", 99, "bottle of 15 tablets", "51 ratings","4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("A to Z Immune Tablet",183,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/evoefwzy0yndnyyeuj0m/a-to-z-immune-tablet.jpg", 215, "strip of 16 tablets", "230 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Neuherbs True Vitamin Tablet",699,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/20f3de2939d34f529f25d325d8e48020/fytika-vita-365-tablet.jpg", 899, "bottle of 60 tablets", "569 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Fytika VITA 365 Tablet",699,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/874c24e9de5d483fbaec1848ed294d5d/tata-1mg-multivitamin-multimineral-supplement-tablet.jpg", 999, "bottle of 60 tablets", "61 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Multivitamin & Multimineral Supplement Tablet",89,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/fvj4yg4go9xjxlb0jfrv/tata-1mg-senior-50-multivitamin-multimineral-immunity-booster-zinc-vitamin-c-calcium-and-vitamin-d-veg-tablet.jpg", 99, "bottle of 15 tablets", "109 ratings","4.4");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Tata 1mg Senior 50+ Multivitamin & Multimineral Immunity Booster Zinc, Vitamin C, Calcium, and Vitamin D Veg Tablet",245,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ryof3pgu9fkhm3jekucf/wellman-50-health-supplement-for-men-tablet.jpg", 510, "bottle of 30 tablets", "171 ratings","4.3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Health Veda Organics Multivitamin with Probiotics Veg Tablet",399,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/xfiayqtoofqahefnpfoq/healthvit-cenvitan-women-multivitamin-multimineral-tablet.jpg", 899, "bottle of 120 tablets", "100 ratings","4.1");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Wellman 50+ Health Supplement for Men Tablet",329,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ahyzwwqf4zx5b1um2xqb/healthkart-hk-vitals-multivitamin-multimineral-amino-acids-taurine-ginseng-extract-tablet.jpg", 411, "bottle of 30 tablets", "145 ratings","4.1");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("HealthVit Cenvitan Women Multivitamin & Multimineral Tablet",426,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ic9bq5aiqabc0pooipek/carbamide-forte-multivitamins-with-probiotics-vegetarian-tablet.jpg", 550, "bottle of 60 tablets", "15 ratings","4.5");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("HealthKart HK Vitals Multivitamin Multimineral, Amino Acids ,Taurine & Ginseng Extract Tablet",399,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/3391fbd09c414b9484a14f04772af87f/multivite-gold-daily-health-supplement-tabgels.jpg", 650, "bottle of 60 tablets", "105 ratings","3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Carbamide Forte Multivitamins with Probiotics Vegetarian Tablet",299,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/ic9bq5aiqabc0pooipek/carbamide-forte-multivitamins-with-probiotics-vegetarian-tablet.jpg", 375, "bottle of 60 tablets", "1 ratings","3");
INSERT INTO Medicines (name,discountedPrice,image,mrp,quantity,ratingCount,ratings) VALUES ("Multivite Gold Daily Health Supplement Tabgels",227,"https://onemg.gumlet.io/images/c_fit,q_auto,w_150,f_auto,h_150/3391fbd09c414b9484a14f04772af87f/multivite-gold-daily-health-supplement-tabgels.jpg", 264, "strip of 15 soft gelatin capsules", "1 ratings","4");
```