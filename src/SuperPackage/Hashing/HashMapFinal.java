package SuperPackage.Hashing;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal <K,V> {
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int haash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(haash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if ((float) (size) / list.size() > lf) {
            reHash();
        }
        entities.add(new Entity( key, value));
        size++;
    }

    private void reHash() {
        System.out.println("We are now rehasing!");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> entries : old) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);

            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return (V) entity.value;
            }
        }
        return null;
    }
        public void remove(K key){
            int hash = Math.abs(key.hashCode() % list.size());
            LinkedList<Entity> entities = list.get(hash);
            Entity target = null;

            for (Entity entity : entities) {
                if (entity.key.equals(key)) {
                    target = entity;
                    break;
                }
                entities.remove(target);
                size--;
            }
        }


    class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}