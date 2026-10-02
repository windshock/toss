// entry=0x50b3c

/* WARNING: Removing unreachable block (ram,0x0015709c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H50b3c(void)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint in_w13;
  uint in_w14;
  long unaff_x19;
  
  uVar2 = (in_w13 >> 2 ^ 0xfffffffc) & in_w13 >> 2;
  uVar3 = CONCAT13(DAT_00281703,
                   CONCAT12((&DAT_00281700)
                            [(-DAT_00275ca8 | 0x642804bbf97b14d6U) +
                             (-DAT_00275ca8 & 0x642804bbf97b14d6U)],_DAT_00281700));
  uVar4 = CONCAT13(DAT_00281707,CONCAT12(DAT_00281706,CONCAT11(DAT_00281705,DAT_00281704)));
  uVar6 = (((uVar3 >> 5 ^ 0xffffffff) & in_w14 << 2 | uVar3 >> 5 & (in_w14 << 2 ^ 0xffffffff)) -
          (((uVar3 << 4 ^ 0xffffffff) & in_w14 >> 3 | uVar3 << 4 & (in_w14 >> 3 ^ 0xffffffff)) ^
          0xffffffff)) - 1;
  uVar5 = (in_w14 ^ 0xffffffff) & in_w13 | in_w14 & (in_w13 ^ 0xffffffff);
  uVar2 = *(uint *)(unaff_x19 + 0x350 + (ulong)(uVar2 & 0xfffffffe | (uVar2 ^ 0xffffffff) & 1) * 4);
  uVar2 = (uVar2 | uVar3) & (uVar2 & uVar3 ^ 0xffffffff);
  uVar2 = (uVar2 ^ uVar5) + (uVar2 & uVar5) * 2;
  uVar2 = -((uVar2 ^ 0xffffffff) & uVar6 | uVar2 & (uVar6 ^ 0xffffffff));
  iVar1 = (uVar4 | uVar2) + (uVar4 & uVar2);
  DAT_00281704 = (undefined1)iVar1;
  DAT_00281705 = (undefined1)((uint)iVar1 >> 8);
  DAT_00281706 = (undefined1)((uint)iVar1 >> 0x10);
  DAT_00281707 = (undefined1)((uint)iVar1 >> 0x18);
                    /* WARNING: Could not recover jumptable at 0x001570a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e9b0)();
  return;
}


