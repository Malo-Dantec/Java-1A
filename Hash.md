Méthodes de HashMap
On vous donne ici quelques méthodes utiles pour HashMap et HashSet.
1. HashMap : classe HashMap<K, V> K : clef, V : valeur
1. Map<String, Integer> dicoFreq = new HashMap<>();
2. put(clef, valeur) ajout d’un couple clef valeur dans le dictionnaire
3. get(clef) récupère la valeur d’une clef
4. keySet() ensemble des clefs d’un dictionnaire
5. values() collection des valeurs du dictionnaire
6. containsKey(Object clef) indique si le dictionnaire contient la clef
7. entrySet() permet de récupérer les couples clef valeur puis d’extraire chacune d’elles grâce aux deux
méthodes getKey() et getValue()
8. clear() supprime tous les couples du dictionnaire.
Méthodes de HashSet
1. HashSet : classe HashSet<E>
1. Set<Integer> ensemble = new HashSet<>();
2. add(E e) ajoute l’élément e dans l’ensemble
3. contains(Object objet) renvoie true si l’ensemble contient objet
4. clear() supprime tous les éléments de l’ensemble
5. isEmpty(), size(), . . .