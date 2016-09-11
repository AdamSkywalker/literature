# Literature

Writers rating based on google search results and goodreads.com rates.<br/>

Current formula: 0.8 r1 + 0.8 r2 + 2.4 r3, where

r1 - points from google search results by '%authorname%' query, e.g. 'Mark Twain' <br/>
r2 - points from google search results by '%authorname% writer' query, e.g. 'Mark Twain writer'<br/>
r3 - points from goodreads.com writer rating

All rates are normalized among authors.
If author has best goodreads.com rating among 100 other authors, he gains 100 points.
If author is #5 in google search results among 100 other authors, he gains 95 points and so on.

First number is author rating. Last three numbers are inverted r1, r2, r3 numbers.<br/>
E.g. Stephen King row means he is #2 in google search query, #1 in google search person query and #26 in goodreads.com


    3344   Oscar Wilde                England          11 10 12
    3304   Edgar Poe                  USA              25 22 5
    3288   Arthur Conan Doyle         England          37 21 2
    3264   Victor Hugo                France           5 32 10
    3256   Carl Jung                  Switzerland      18 35 5
    3152   Stephen King               USA              2 1 26
    3080   Simone de Beauvoir         France           31 5 18
    3072   John Keats                 England          40 42 3
    3008   Jack London                USA              1 2 32
    2984   Charles Baudler            England          47 52 1
    2944   Martin Heidegger           Germany          42 23 14
    2944   Jane Austen                England          50 24 11
    2928   Dante Alighieri            Italy            28 21 20
    2920   Friedrich Nietzsche        Germany          26 33 17
    2912   Fedor Dostoevskiy          Russia           55 38 6
    2872   Albert Camus               France           27 5 28
    2847   Alexander Pushkin          Russia           30 50 13
    2775   Alexandre Dumas            France           35 69 8
    2768   George Gordon Byron        England          23 16 30
    2712   Isaac Asimov               USA              54 55 9
    2696   William Shakespeare        England          6 6 42
    2695   Mikhail Lermontov          Russia           53 61 8
    2680   George Oruell              England          20 42 26
    2680   Ray Bradbury               USA              48 14 26
    2664   Hermann Hesse              Switzerland      39 37 22
    2600   Henry Miller               USA              3 3 48
    2568   Immanuele Kant             Germany          32 8 38
    2552   Richard Bach               USA              14 28 38
    2528   Nikolai Gogol              Ukraine          71 43 15
    2512   Auldous Huxley             England          57 17 29
    2472   Umberto Eco                Italy            4 69 31
    2464   Anton Chekhov              Russia           59 42 22
    2456   Erich Maria Remarque       Germany          75 15 26
    2432   Mark Twain                 USA              10 29 44
    2400   Jules Verne                France           21 34 40
    2392   Jean-Paul Sartre           France           36 56 28
    2336   Boris Pasternak            Russia           60 72 17
    2320   Lev Tolstoi                Russia           82 46 19
    2320   Vladimir Lenin             Russia           29 57 33
    2320   Charles Dickens            England          15 44 42
    2224   Franz Kafka                Germany          34 49 38
    2216   Ernest Hemingway           USA              24 30 48
    2096   John Milton                England          66 9 46
    1992   J. D. Salinger             USA              46 42 46
    1968   Ivan Turgenev              Russia           64 63 34
    1712   Stendhal                   France           43 86 44
    1640   Theodore Draiser           USA              58 92 40
    1576   Vladimir Nabokov           Russia           90 83 35
    1480   Sigmund Freud              Austria          22 7 87
    1384   Voltaire                   France           13 19 90
    1368   Mary Shelley               England          16 12 92
    1336   Adolph Hitler              Germany          12 11 95
    1280   George Sand                France           7 26 94
    1240   Jean-Jacques Rousseau      France           19 25 92
    1240   Karl Marx                  Germany          9 32 93
    1224   Herbert Wells              England          8 53 87
    1104   Georg Hegel                Germany          63 13 87
    1096   Homer                      Ancient Greece   17 51 90
    1048   Johann Goethe              Germany          34 46 88
    0976   Charlotte Bronte           England          65 27 87
    0880   Ken Kesey                  USA              85 19 87
    0816   Friedrich Engels           Germany          38 74 87
    0808   Mikhail Bulgakov           Russia           77 36 87
    0800   Antoine de Saint-Exupéry   France           49 65 87
    0752   Émile Zola                 France           41 79 87
    0752   Euripides                  Ancient Greece   51 69 87
    0744   Maxim Gorkiy               Russia           72 49 87
    0744   Denis Diderot              France           44 77 87
    0744   Gustave Flaubert           France           62 59 87
    0736   Arthur Schopenhauer        Germany          68 54 87
    0728   Oliver Sacks               England          52 71 87
    0728   Molière                    France           45 78 87
    0664   William Golding            England          61 70 87
    0648   Baruch Spinoza             Denmark          86 47 87
    0648   J. M. Coetzee              South Africa     67 66 87
    0600   Honoré de Balzac           France           81 58 87
    0552   Guy de Maupassant          France           69 76 87
    0536   William Thackeray          England          83 64 87
    0528   Soren Kierkegaard          Denmark          88 60 87
    0520   Frédéric Beigbeder         France           56 93 87
    0512   Ivan Goncharov             Russia           75 75 87
    0472   Sophocles                  Ancient Greece   93 62 87
    0455   Milan Kundera              Czech republic   70 87 87
    0440   Stefan Zweig               Austria          78 81 87
    0408   Alexander Kuprin           Russia           81 82 87
    0408   Erich Fromm                Germany          73 90 87
    0400   Chuck Palahniuk            USA              91 73 87
    0384   Eshil                      Ancient Greece   81 85 87
    0344   Jonathan Safran Foer       USA              87 84 87
    0344   Aristophanes               Ancient Greece   76 95 87
    0328   Alexander Griboedov        Russia           84 89 87
    0312   Ethel Voynich              England          95 80 87
    0296   John Fowles                England          89 88 87
    0232   Nikolay Chernishevskiy     Russia           94 91 87
    0224   Irvin D. Yalom             USA              92 94 87
