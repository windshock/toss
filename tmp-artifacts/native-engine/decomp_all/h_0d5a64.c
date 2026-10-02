// entry=0xd5a64

void Hd5a64(long param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  undefined4 *in_x17;
  long lVar8;
  
  *in_x17 = 0;
  in_x17[1] = 0;
  *(undefined4 *)(param_1 + 0xc) = 0;
  uVar2 = CONCAT13(DAT_00279ed3,CONCAT12(DAT_00279ed2,CONCAT11(DAT_00279ed1,DAT_00279ed0)));
  lVar7 = 0x47;
  do {
    uVar6 = (uint)lVar7;
    uVar4 = *(uint *)(&DAT_00279ed0 + (ulong)(uVar6 - 1) * 4);
    lVar8 = lVar7 * 4;
    uVar5 = *(uint *)(&DAT_00279ed0 + lVar8);
    uVar3 = (((uVar4 >> 5 | uVar2 << 2) & (uVar4 >> 5 & uVar2 << 2 ^ 0xffffffff)) -
            ((uVar4 << 4 | uVar2 >> 3) & (uVar4 << 4 & uVar2 >> 3 ^ 0xffffffff) ^ 0xffffffff)) - 1;
    uVar2 = (uVar2 | 0xb54cda56) & (uVar2 & 0xb54cda56 ^ 0xffffffff);
    uVar1 = (uVar6 ^ 0xfffffffc) & uVar6;
    uVar1 = *(uint *)(param_1 + (ulong)((uVar1 | 1) & (uVar1 & 1 ^ 0xffffffff)) * 4);
    uVar1 = (uVar1 | uVar4) & (uVar1 & uVar4 ^ 0xffffffff);
    uVar2 = (uVar1 | uVar2) * 2 - (uVar1 ^ uVar2);
    uVar2 = -((uVar2 | uVar3) & (uVar2 & uVar3 ^ 0xffffffff));
    uVar2 = (uVar5 | uVar2) * 2 - (uVar5 ^ uVar2);
    (&DAT_00279ed0)[lVar8] = (char)uVar2;
    (&DAT_00279ed1)[lVar8] = (char)(uVar2 >> 8);
    (&DAT_00279ed2)[lVar8] = (char)(uVar2 >> 0x10);
    (&DAT_00279ed3)[lVar8] = (char)(uVar2 >> 0x18);
    lVar7 = lVar7 + -1;
  } while (uVar6 - 1 != 0);
                    /* WARNING: Could not recover jumptable at 0x001d5cd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002831a8)();
  return;
}


