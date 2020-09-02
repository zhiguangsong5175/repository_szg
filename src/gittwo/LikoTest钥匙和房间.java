package gittwo;

import java.util.ArrayList;
import java.util.List;

public class LikoTest钥匙和房间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> rooms = new ArrayList<>();
/*		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		rooms.add(list1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(0);
		rooms.add(list2);
		List<Integer> list3 = new ArrayList<>();
		list3.add(2);
		rooms.add(list3);
		List<Integer> list4 = new ArrayList<>();
		list4.add(0);
		rooms.add(list4);
		boolean canVisitAllRooms = canVisitAllRooms(rooms);*/
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		rooms.add(list1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(3);
		list2.add(0);
		rooms.add(list2);
		List<Integer> list3 = new ArrayList<>();
		list3.add(2);
		rooms.add(list3);
		List<Integer> list4 = new ArrayList<>();
		list4.add(0);
		rooms.add(list4);
		boolean canVisitAllRooms = canVisitAllRooms(rooms);
		System.out.println(canVisitAllRooms);
	}
	static boolean[] vis;
	static  int num;

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public static void dfs(List<List<Integer>> rooms, int x) {
        vis[x] = true;
        num++;
        for (int it : rooms.get(x)) {
            if (!vis[it]) {
                dfs(rooms, it);
            }
        }
    }

}
