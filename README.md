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


    2613   J. K. Rowling              1965..            England            17 15  1
    2494   Oscar Wilde                1856..1900        England            11 11 23
    2475   Stephen King               1947..            USA                 2  1 44
    2356   Victor Hugo                1802..1885        France              5 35 19
    2356   Jack London                1876..1916        USA                 1  2 56
    2346   Edgar Poe                  1809..1849        USA                26 24 10
    2277   Carl Jung                  1875..1961        Switzerland        19 38 10
    2267   Arthur Conan Doyle         1859..1930        England            39 23  6
    2267   Simone de Beauvoir         1908..1986        France             32  6 30
    2237   J. R. R. Tolkien           1892..1973        England            38 31  2
    2138   Albert Camus               1913..1960        France             28  6 47
    2118   William Shakespeare        1564..1616        England             6  7 70
    2108   Henry Miller               1891..1980        USA                 3  3 78
    2088   Dante Alighieri            1265..1321        Italy              29 23 34
    2029   Friedrich Nietzsche        1844..1900        Germany            27 36 29
    2029   George Gordon Byron        1788..1824        England            24 18 50
    2009   John Keats                 1795..1821        England            42 45  7
    1999   Martin Heidegger           1889..1976        Germany            44 25 26
    1960   Jane Austen                1775..1817        England            53 26 20
    1900   Philip K. Dick             1928..1982        USA                50  4 51
    1890   Immanuele Kant             1724..1804        Germany            33  9 64
    1861   Alexander Pushkin          1799..1937        Russia             31 53 25
    1861   Charles Baudler            1821..1867        England            49 55  5
    1861   Richard Bach               1936..            USA                14 31 64
    1851   George Oruell              1903..1950        England            21 45 44
    1841   Fedor Dostoevskiy          1821..1881        Russia             58 41 12
    1841   Sigmund Freud              1856..1939        Austria            23  8 80
    1841   Ray Bradbury               1920..2012        USA                51 16 44
    1811   Mark Twain                 1835..1910        USA                10 32 72
    1791   Mary Shelley               1797..1851        England            16 13 87
    1772   Voltaire                   1694..1798        France             13 21 84
    1762   Ken Kesey                  1935..2001        USA                88 21 10
    1742   Hermann Hesse              1877..1962        Switzerland        41 40 40
    1732   Charlotte Bronte           1816..1855        England            68 29 25
    1722   Mikhail Bulgakov           1891..1940        Russia             80 39  4
    1722   Adolph Hitler              1889..1945        Germany            12 12 99
    1712   Alexandre Dumas            1802..1870        France             36 72 16
    1712   Antoine de Saint-Exupéry   1900..1940        France             52 68  4
    1692   Jules Verne                1828..1905        France             22 37 67
    1683   George Sand                1804..1876        France              7 28 92
    1673   Auldous Huxley             1894..1963        England            60 19 49
    1663   Umberto Eco                1932..2016        Italy               4 72 53
    1633   Charles Dickens            1812..1870        England            15 47 70
    1623   Isaac Asimov               1920..1992        USA                57 58 18
    1613   Jean-Jacques Rousseau      1712..1778        France             20 27 87
    1603   Karl Marx                  1818..1883        Germany             9 35 91
    1593   Ernest Hemingway           1899..1961        USA                25 33 78
    1593   Mikhail Lermontov          1814..1841        Russia             56 64 16
    1564   Erich Maria Remarque       1898..1970        Germany            78 17 44
    1534   Herbert Wells              1866..1946        England             8 56 78
    1524   Jean-Paul Sartre           1905..1980        France             37 59 47
    1514   Georg Hegel                1770..1831        Germany            66 14 64
    1485   Nikolai Gogol              1809..1852        Ukraine            74 46 27
    1485   Anton Chekhov              1860..1904        Russia             62 45 40
    1485   Vladimir Lenin             1870..1924        Russia             30 60 57
    1445   Franz Kafka                1883..1924        Germany            35 52 64
    1415   John Milton                1608..1674        England            69 10 75
    1395   Homer                      1100..1000 B.C.   Ancient Greece     18 54 84
    1346   Arthur Schopenhauer        1788..1860        Germany            71 57 33
    1306   Johann Goethe              1749..1832        Germany            35 49 81
    1287   Lev Tolstoi                1828..1910        Russia             85 49 33
    1287   Boris Pasternak            1890..1960        Russia             63 75 29
    1277   J. D. Salinger             1919..2010        USA                48 45 75
    1267   Oliver Sacks               1933..2015        England            55 74 40
    1197   Stefan Zweig               1881..1942        Austria            81 84 11
    1178   Soren Kierkegaard          1813..1855        Denmark            92 63 23
    1168   Baruch Spinoza             1632..1677        Denmark            89 50 40
    1148   Émile Zola                 1840..1902        France             43 82 56
    1138   Euripides                  480....406 B.C.   Ancient Greece     54 72 56
    1079   Erich Fromm                1900..1980        Germany            76 94 18
    1049   Ivan Turgenev              1818..1883        Russia             67 66 58
    1039   Alexander Kuprin           1870..1938        Russia             84 85 23
    0999   Ethel Voynich              1864..1960        England            99 83 14
    0990   Maxim Gorkiy               1868..1936        Russia             75 52 70
    0950   Ivan Goncharov             1812..1891        Russia             78 78 45
    0930   Milan Kundera              1929..            Czech republic     73 90 40
    0900   Stendhal                   1783..1842        France             45 89 72
    0881   Irvin D. Yalom             1931..            USA                96 98 14
    0841   Friedrich Engels           1820..1895        Germany            40 77 95
    0792   Stanisław Lem              1921..2006        Ukraine            91 93 33
    0792   Denis Diderot              1713..1784        France             46 80 91
    0782   Guy de Maupassant          1850..1893        France             72 79 67
    0772   Alexander Griboedov        1795..1829        Russia             87 92 40
    0772   Molière                    1622..1673        France             47 81 91
    0762   Gustave Flaubert           1821..1880        France             65 62 93
    0732   J. M. Coetzee              1940..            South Africa       70 69 84
    0722   Theodore Draiser           1871..1945        USA                61 96 67
    0712   Honoré de Balzac           1799..1850        France             84 61 80
    0693   Jonathan Safran Foer       1977..            USA                91 87 49
    0653   William Golding            1911..1993        England            64 73 94
    0594   John Fowles                1926..2005        England            93 91 53
    0584   William Thackeray          1811..1863        England            86 67 85
    0574   Vladimir Nabokov           1899..1977        Russia             94 86 59
    0544   Aristophanes               446....386 B.C.   Ancient Greece     79 99 64
    0524   Chuck Palahniuk            1962..            USA                95 76 73
    0465   Sophocles                  497....406 B.C.   Ancient Greece     97 65 88
    0435   Frédéric Beigbeder         1965..            France             59 97 97
    0287   Eshil                      520....460 B.C.   Ancient Greece     84 88 96
    0059   Nikolay Chernishevskiy     1828..1889        Russia             98 95 98
