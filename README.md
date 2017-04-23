# Literature

Writers rating based on google search results and goodreads.com rates.<br/>

Current formula: r1 + r2 + 2 * r3, where

r1 - points from google search results by '%authorname%' query, e.g. 'Mark Twain' <br/>
r2 - points from google search results by '%authorname% writer' query, e.g. 'Mark Twain writer'<br/>
r3 - points from goodreads.com writer rating

All rates are normalized among authors.
If author has best goodreads.com rating among 100 other authors, he gains 100 points.
If author is #5 in google search results among 100 other authors, he gains 95 points and so on.

First number is author rating. Last three numbers are inverted r1, r2, r3 numbers.<br/>
E.g. Stephen King row means he is #2 in google search query, #1 in google search person query and #44 in goodreads.com


    3951   J. K. Rowling              1965..            England            18 18  1
    3642   Oscar Wilde                1856..1900        England            12 13 22
    3603   Edgar Poe                  1809..1849        USA                28 27  9
    3523   Victor Hugo                1802..1885        France              5 40 18
    3515   J. R. R. Tolkien           1892..1973        England            43 35  2
    3514   Arthur Conan Doyle         1859..1930        England            44 26  6
    3514   Carl Jung                  1875..1961        Switzerland        20 44  9
    3362   Stephen King               1947..            USA                 2  1 47
    3274   Simone de Beauvoir         1908..1986        France             36  8 31
    3097   Jane Austen                1775..1817        England            57 29 19
    3077   Martin Heidegger           1889..1976        Germany            48 28 25
    3073   Jack London                1876..1916        USA                 1  3 61
    3047   Friedrich Nietzsche        1844..1900        Germany            29 42 29
    3029   Fedor Dostoevskiy          1821..1881        Russia             62 47 11
    3016   Dante Alighieri            1265..1321        Italy              32 26 37
    3010   Marcel Proust              1871..1922        France             90 33  5
    2989   Ken Kesey                  1935..2001        USA                93 24  9
    2970   Mikhail Bulgakov           1891..1940        Russia             84 45  4
    2950   Antoine de Saint-Exupéry   1900..1940        France             56 75  4
    2946   Albert Camus               1913..1960        France             31  8 50
    2929   Alexander Pushkin          1799..1837        Russia             34 59 24
    2850   Alexandre Dumas            1802..1870        France             40 79 15
    2810   Charlotte Bronte           1816..1855        England            73 32 24
    2807   Agatha Christie            1890..1976        England            30 17 53
    2787   George Gordon Byron        1788..1824        England            26 21 54
    2751   Isaac Asimov               1920..1992        USA                61 64 17
    2731   Mikhail Lermontov          1814..1841        Russia             60 71 15
    2659   George Oruell              1903..1950        England            23 51 47
    2659   Ray Bradbury               1920..2012        USA                55 19 47
    2618   Philip K. Dick             1928..1982        USA                54  6 56
    2616   William Shakespeare        1564..1616        England             7  9 78
    2566   Henry Miller               1891..1980        USA                 3  4 85
    2560   Hermann Hesse              1877..1962        Switzerland        46 46 43
    2522   Nikolai Gogol              1809..1852        Ukraine            78 52 26
    2429   Immanuele Kant             1724..1804        Germany            37 12 71
    2421   Auldous Huxley             1894..1963        England            64 22 53
    2419   Richard Bach               1936..            USA                15 35 71
    2411   Gabriel García Márquez     1927..2014        Mexico             41 40 56
    2385   Stefan Zweig               1881..1942        Austria            85 91 10
    2382   Erich Maria Remarque       1898..1970        Germany            82 20 47
    2354   Kurt Vonnegut              1922..2007        USA                100 41 29
    2351   Umberto Eco                1932..2016        Italy               4 79 58
    2340   F. Scott Fitzgerald        1896..1940        USA                53  5 71
    2337   James Joyce                1882..1941        Ireland             6  2 96
    2313   Anton Chekhov              1860..1904        Russia             66 51 43
    2270   Mark Twain                 1835..1910        USA                11 36 80
    2265   Boris Pasternak            1890..1960        Russia             68 82 29
    2263   Jean-Paul Sartre           1905..1980        France             42 66 50
    2244   Arthur Schopenhauer        1788..1860        Germany            75 63 36
    2226   Soren Kierkegaard          1813..1855        Denmark            98 70 22
    2219   Sigmund Freud              1856..1939        Austria            25 11 88
    2191   Jules Verne                1828..1905        France             24 43 74
    2177   Erich Fromm                1900..1980        Germany            80 103 17
    2175   Lev Tolstoi                1828..1910        Russia             90 55 36
    2145   Charles Bukowski           1920..1994        USA                97 51 36
    2120   Voltaire                   1694..1798        France             14 24 92
    2107   Alexander Kuprin           1870..1938        Russia             88 92 22
    2100   Mary Shelley               1797..1851        England            17 15 96
    2098   Ethel Voynich              1864..1960        England            109 90 13
    2092   Charles Dickens            1812..1870        England            16 53 78
    2085   Oliver Sacks               1933..2015        England            59 81 43
    2083   Vladimir Lenin             1870..1924        Russia             33 67 63
    2053   Georg Hegel                1770..1831        Germany            71 16 71
    2002   Ernest Hemingway           1899..1961        USA                27 37 85
    1986   Baruch Spinoza             1632..1677        Denmark            94 56 43
    1960   Jonathan Swift             1667..1745        Ireland            22 10 103
    1959   Irvin D. Yalom             1931..            USA                105 108 13
    1954   Franz Kafka                1883..1924        Germany            39 58 71
    1932   Herbert Wells              1866..1946        England             9 62 85
    1931   George Sand                1804..1876        France              8 31 101
    1912   Jean-Jacques Rousseau      1712..1778        France             21 30 96
    1890   Adolph Hitler              1889..1945        Germany            13 14 109
    1842   Karl Marx                  1818..1883        Germany            10 40 100
    1767   Émile Zola                 1840..1902        France             47 89 61
    1757   Euripides                  480....406 B.C.   Ancient Greece     58 79 61
    1756   John Steinbeck             1902..1968        USA                67 66 63
    1749   Milan Kundera              1929..            Czech republic     77 97 43
    1718   Ivan Goncharov             1812..1891        Russia             82 85 48
    1704   Homer                      1100..1000 B.C.   Ancient Greece     19 61 92
    1675   J. D. Salinger             1919..2010        USA                52 51 82
    1650   Stanisław Lem              1921..2006        Ukraine            96 102 36
    1641   Mikhail Sholokhov          1905..1984        Russia             108 101 31
    1635   Virginia Woolf             1882..1941        England            35 60 88
    1625   Johann Goethe              1749..1832        Germany            39 55 89
    1621   Carlos Castaneda           1925..1998        USA                103 98 36
    1618   Ivan Turgenev              1818..1883        Russia             72 73 64
    1570   Alexander Griboedov        1795..1829        Russia             92 100 43
    1418   Maxim Gorkiy               1868..1936        Russia             79 58 78
    1391   Jonathan Safran Foer       1977..            USA                96 94 53
    1299   Stendhal                   1783..1842        France             49 96 80
    1250   Guy de Maupassant          1850..1893        France             76 86 74
    1212   John Fowles                1926..2005        England            99 99 58
    1171   Theodore Draiser           1871..1945        USA                65 105 74
    1113   Vladimir Nabokov           1899..1977        Russia             101 93 65
    1031   Honoré de Balzac           1799..1850        France             88 68 88
    1013   Aristophanes               446....386 B.C.   Ancient Greece     83 109 71
    1011   J. M. Coetzee              1940..            South Africa       74 76 92
    0981   Denis Diderot              1713..1784        France             50 87 100
    0961   Molière                    1622..1673        France             51 88 100
    0960   Friedrich Engels           1820..1895        Germany            45 84 105
    0901   Gustave Flaubert           1821..1880        France             70 69 103
    0864   Chuck Palahniuk            1962..            USA                104 83 81
    0843   William Thackeray          1811..1863        England            91 74 93
    0782   William Golding            1911..1993        England            69 80 104
    0706   Bernard Werber             1961..            France             102 107 78
    0634   Sophocles                  497....406 B.C.   Ancient Greece     106 72 97
    0524   Frédéric Beigbeder         1965..            France             63 106 107
    0406   Eshil                      520....460 B.C.   Ancient Greece     88 95 106
    0089   Nikolay Chernishevskiy     1828..1889        Russia             107 104 108