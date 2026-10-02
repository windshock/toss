// entry=0xba378

void FUN_001ba378(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00279e78;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x44f783ffU) * 2 - (-iVar1 ^ 0x44f783ffU)) * 300 +
             (long)(int)((-iVar1 ^ 0x44f78502U) + (-iVar1 & 0x44f78502U) * 2)])
            ((-iVar1 | 0x44f78400U) + (-iVar1 & 0x44f78400U),param_2,param_1,param_2,param_3,param_4
            );
                    /* WARNING: Could not recover jumptable at 0x001ba3fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00281ca0)[(long)(int)(0x44f783fe - (-(int)DAT_00279e78 ^ 0xffffffffU)) * 0x6c]
  )();
  return;
}


