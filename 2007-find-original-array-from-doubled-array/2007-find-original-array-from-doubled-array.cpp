class Solution {
public:
    vector<int> findOriginalArray(vector<int>& changed) {
        sort(changed.begin(),changed.end(),greater<int>());
        vector<int> ans;
        map<int,int> mp;
        
        for(int i=0;i<changed.size();i++)
        {
            int a=changed[i]*2;
             if(mp.count(a)>0)
             {
                 ans.push_back(changed[i]);
                   mp[a]--;
                 if(mp[a]<=0)
                 mp.erase(a);
             }
            else{
               mp[changed[i]]++;
            }
        }
        
        if(mp.size()==0){        
            return ans;
    }
        else{
            ans.clear();
            return ans;
        }
    }
};