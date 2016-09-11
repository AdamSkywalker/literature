# Literature

Writers rating based on google search results and goodreads.com rates.<br/>

Current formula: r1 + r2 + r3, where

r1 - points from google search results by '%authorname%' query, e.g. 'Mark Twain' <br/>
r2 - points from google search results by '%authorname% writer' query, e.g. 'Mark Twain writer'<br/>
r3 - points from goodreads.com writer rating

All rates are normalized among authors.
If author has best goodreads.com rating among 100 other authors, he gains 100 points.
If author is #5 in google search results among 100 other authors, he gains 95 points and so on.

First number is author rating. Last three numbers are inverted r1, r2, r3 numbers.<br/>
E.g. Stephen King row means he is #2 in google search query, #1 in google search person query and #26 in goodreads.com


    2623   Stephen King               USA              2 1 29
    2613   J. K. Rowling              England          17 15 1
    2583   Oscar Wilde                England          11 11 14
    2554   Jack London                USA              1 2 36
    2425   Victor Hugo                France           5 35 12
    2375   Edgar Poe                  USA              26 24 7
    2366   Henry Miller               USA              3 3 52
    2366   Simone de Beauvoir         France           32 6 20
    2356   William Shakespeare        England          6 7 46
    2306   Carl Jung                  Switzerland      19 38 7
    2296   Albert Camus               France           28 6 31
    2286   Arthur Conan Doyle         England          39 23 4
    2237   J. R. R. Tolkien           England          38 31 2
    2197   George Gordon Byron        England          24 18 33
    2197   Dante Alighieri            Italy            29 23 23
    2128   Friedrich Nietzsche        Germany          27 36 19
    2108   Immanuele Kant             Germany          33 9 42
    2098   Martin Heidegger           Germany          44 25 16
    2079   Richard Bach               USA              14 31 42
    2069   Philip K. Dick             USA              50 4 34
    2049   Mark Twain                 USA              10 32 48
    2029   Jane Austen                England          53 26 13
    2029   John Keats                 England          42 45 5
    1999   George Oruell              England          21 45 29
    1989   Ray Bradbury               USA              51 16 29
    1960   Alexander Pushkin          Russia           31 53 15
    1920   Jules Verne                France           22 37 44
    1890   Hermann Hesse              Switzerland      41 40 25
    1881   Fedor Dostoevskiy          Russia           58 41 8
    1881   Charles Baudler            England          49 55 3
    1871   Charles Dickens            England          15 47 46
    1851   Ernest Hemingway           USA              25 33 52
    1841   Auldous Huxley             England          60 19 32
    1841   Umberto Eco                Italy            4 72 35
    1772   Alexandre Dumas            France           36 72 10
    1732   Sigmund Freud              Austria          23 8 91
    1722   Adolph Hitler              Germany          12 12 99
    1712   Erich Maria Remarque       Germany          78 17 29
    1702   Mary Shelley               England          16 13 96
    1692   Isaac Asimov               USA              57 58 11
    1683   Vladimir Lenin             Russia           30 60 37
    1683   Jean-Paul Sartre           France           37 59 31
    1673   Voltaire                   France           13 21 94
    1663   Franz Kafka                Germany          35 52 42
    1663   John Milton                England          69 10 50
    1653   Mikhail Lermontov          Russia           56 64 10
    1633   Anton Chekhov              Russia           62 45 25
    1623   George Sand                France           7 28 98
    1583   Nikolai Gogol              Ukraine          74 46 17
    1544   Karl Marx                  Germany          9 35 97
    1524   Jean-Jacques Rousseau      France           20 27 96
    1524   J. D. Salinger             USA              48 45 50
    1405   Herbert Wells              England          8 56 91
    1395   Lev Tolstoi                Russia           85 49 22
    1386   Boris Pasternak            Russia           63 75 19
    1296   Homer                      Ancient Greece   18 54 94
    1247   Georg Hegel                Germany          66 14 91
    1247   Ivan Turgenev              Russia           67 66 38
    1197   Johann Goethe              Germany          35 49 92
    1138   Stendhal                   France           45 89 48
    1079   Charlotte Bronte           England          68 29 91
    0960   Ken Kesey                  USA              88 21 91
    0950   Theodore Draiser           USA              61 96 44
    0900   Stanisław Lem              Ukraine          91 93 22
    0881   Friedrich Engels           Germany          40 77 91
    0861   Mikhail Bulgakov           Russia           80 39 91
    0851   Antoine de Saint-Exupéry   France           52 68 91
    0801   Émile Zola                 France           43 82 91
    0792   Denis Diderot              France           46 80 91
    0792   Euripides                  Ancient Greece   54 72 91
    0782   Maxim Gorkiy               Russia           75 52 91
    0782   Gustave Flaubert           France           65 62 91
    0772   Vladimir Nabokov           Russia           94 86 39
    0772   Arthur Schopenhauer        Germany          71 57 91
    0772   Molière                    France           47 81 91
    0762   Oliver Sacks               England          55 74 91
    0683   William Golding            England          64 73 91
    0663   Baruch Spinoza             Denmark          89 50 91
    0663   J. M. Coetzee              South Africa     70 69 91
    0603   Honoré de Balzac           France           84 61 91
    0544   Guy de Maupassant          France           72 79 91
    0524   William Thackeray          England          86 67 91
    0504   Soren Kierkegaard          Denmark          92 63 91
    0495   Ivan Goncharov             Russia           78 78 91
    0495   Frédéric Beigbeder         France           59 97 91
    0435   Sophocles                  Ancient Greece   97 65 91
    0425   Milan Kundera              Czech republic   73 90 91
    0405   Stefan Zweig               Austria          81 84 91
    0366   Alexander Kuprin           Russia           84 85 91
    0356   Erich Fromm                Germany          76 94 91
    0346   Chuck Palahniuk            USA              95 76 91
    0336   Eshil                      Ancient Greece   84 88 91
    0277   Jonathan Safran Foer       USA              91 87 91
    0277   Aristophanes               Ancient Greece   79 99 91
    0267   Alexander Griboedov        Russia           87 92 91
    0237   Ethel Voynich              England          99 83 91
    0217   John Fowles                England          93 91 91
    0128   Nikolay Chernishevskiy     Russia           98 95 91
    0118   Irvin D. Yalom             USA              96 98 91
