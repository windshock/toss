// entry=0x9124c

void HND_93aa0(long param_1)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint in_w9;
  uint in_w10;
  uint in_w11;
  uint uVar6;
  ulong in_x12;
  ulong in_x13;
  uint in_w14;
  uint in_w15;
  int *in_x16;
  uint in_w17;
  
  while( true ) {
    *(char *)in_x16 = (char)in_w11;
    *(char *)((long)in_x16 + 1) = (char)in_w15;
    *(char *)((long)in_x16 + 2) = (char)in_w14;
    *(char *)((long)in_x16 + 3) = (char)in_w17;
    in_x12 = (in_x12 ^ 0xffffffffffffffff) + in_x12 * 2;
    if ((int)in_x13 == 0) break;
    uVar6 = (uint)in_x12;
    in_x13 = (ulong)((uVar6 ^ 0xffffffff) + uVar6 * 2);
    uVar2 = CONCAT13(*(undefined1 *)
                      ((long)(&DAT_002747ba + in_x13 * 4) +
                      ((-DAT_00285758 | 0x940710612d39c15dU) * 2 -
                      (-DAT_00285758 ^ 0x940710612d39c15dU))),
                     *(undefined3 *)(&DAT_002747ba + in_x13 * 4));
    in_x16 = (int *)(&DAT_002747ba + in_x12 * 4);
    uVar4 = (uVar2 >> 5 ^ 0xffffffff) & in_w11 << 2 | uVar2 >> 5 & (in_w11 << 2 ^ 0xffffffff);
    uVar5 = (uVar2 << 4 ^ 0xffffffff) & in_w11 >> 3 | uVar2 << 4 & (in_w11 >> 3 ^ 0xffffffff);
    uVar5 = (uVar4 | uVar5) * 2 - (uVar4 ^ uVar5);
    uVar4 = (in_w11 | in_w9) & (in_w11 & in_w9 ^ 0xffffffff);
    uVar6 = (uVar6 ^ 0xfffffffc) & uVar6;
    uVar6 = *(uint *)(param_1 + (ulong)((uVar6 | in_w10) & (uVar6 & in_w10 ^ 0xffffffff)) * 4);
    uVar6 = (uVar6 ^ 0xffffffff) & uVar2 | uVar6 & (uVar2 ^ 0xffffffff);
    uVar4 = (uVar6 ^ uVar4) + (uVar6 & uVar4) * 2;
    in_w11 = (*in_x16 - (-((uVar4 | uVar5) & (uVar4 & uVar5 ^ 0xffffffff)) ^ 0xffffffff)) - 1;
    in_w15 = in_w11 >> 8;
    in_w14 = in_w11 >> (ulong)((-(int)DAT_00285758 | 0xc16aU) * 2 - (-(int)DAT_00285758 ^ 0xc16aU) &
                              0x1f);
    in_w17 = in_w11 >> 0x18;
  }
  uVar2 = CONCAT13(DAT_002747d1,CONCAT12(DAT_002747d0,CONCAT11(DAT_002747cf,DAT_002747ce)));
  uVar5 = CONCAT13(DAT_002747bd,CONCAT12(DAT_002747bc,CONCAT11(DAT_002747bb,DAT_002747ba)));
  uVar6 = (uVar2 >> 5 ^ 0xffffffff) & in_w11 << 2 | uVar2 >> 5 & (in_w11 << 2 ^ 0xffffffff);
  uVar4 = (uVar2 << 4 | in_w11 >> 3) & (uVar2 << 4 & in_w11 >> 3 ^ 0xffffffff);
  uVar4 = (uVar6 ^ uVar4) + (uVar6 & uVar4) * 2;
  uVar6 = (in_w11 | in_w9) & (in_w11 & in_w9 ^ 0xffffffff);
  uVar3 = *(uint *)(param_1 + (ulong)in_w10 * 4);
  uVar2 = (uVar3 | uVar2) & (uVar3 & uVar2 ^ 0xffffffff);
  uVar6 = (uVar2 | uVar6) * 2 - (uVar2 ^ uVar6);
  uVar4 = -((uVar6 | uVar4) & (uVar6 & uVar4 ^ 0xffffffff));
  iVar1 = (uVar5 ^ uVar4) + (uVar5 & uVar4) * 2;
  DAT_002747ba = (undefined1)iVar1;
  DAT_002747bb = (undefined1)((uint)iVar1 >> 8);
  DAT_002747bc = (undefined1)((uint)iVar1 >> 0x10);
  DAT_002747bd = (undefined1)((uint)iVar1 >> 0x18);
  if ((in_w9 | 0x61c88647) + (in_w9 & 0x61c88647) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00193160. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002813b0)();
    return;
  }
  DAT_002862e0 = DAT_002862e0 & 1 | DAT_002862e0 ^ 1;
                    /* WARNING: Could not recover jumptable at 0x00192a7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027fac0)();
  return;
}


